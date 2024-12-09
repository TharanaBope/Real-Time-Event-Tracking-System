package com.tharana.oop_backend.service.impl;

import com.tharana.oop_backend.entity.Customer;
import com.tharana.oop_backend.entity.Ticket;
import com.tharana.oop_backend.repository.CustomerRepository;
import com.tharana.oop_backend.repository.TicketRepository;
import com.tharana.oop_backend.service.CustomerService;
import com.tharana.oop_backend.util.enums.TicketStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final TicketRepository ticketRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository, TicketRepository ticketRepository) {
        this.customerRepository = customerRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + id));
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Ticket> purchaseTickets(int customerId, int numberOfTickets) {
        Customer customer = getCustomerById(customerId);
        List<Ticket> availableTickets = ticketRepository.findByStatus(TicketStatus.AVAILABLE.name());

        if (availableTickets.size() < numberOfTickets) {
            throw new RuntimeException("Not enough tickets available to purchase.");
        }

        List<Ticket> purchasedTickets = new ArrayList<>();
        for (int i = 0; i < numberOfTickets; i++) {
            Ticket ticket = availableTickets.get(i);
            ticket.setStatus(TicketStatus.SOLD);
            ticket.setCustomer(customer);
            purchasedTickets.add(ticketRepository.save(ticket));
        }

        return purchasedTickets;
    }
}

