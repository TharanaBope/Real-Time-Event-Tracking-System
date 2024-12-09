package com.tharana.oop_backend.service;

import com.tharana.oop_backend.entity.Customer;
import com.tharana.oop_backend.entity.Ticket;
import java.util.List;

public interface CustomerService {
    Customer getCustomerById(int id);
    Customer addCustomer(Customer customer);
    List<Ticket> purchaseTickets(int customerId, int numberOfTickets);
}
