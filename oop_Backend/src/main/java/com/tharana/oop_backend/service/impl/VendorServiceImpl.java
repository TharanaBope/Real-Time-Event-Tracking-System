package com.tharana.oop_backend.service.impl;

import com.tharana.oop_backend.entity.Ticket;
import com.tharana.oop_backend.entity.Vendor;
import com.tharana.oop_backend.repository.TicketRepository;
import com.tharana.oop_backend.repository.VendorRepository;
import com.tharana.oop_backend.service.VendorService;
import com.tharana.oop_backend.util.enums.TicketStatus;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImpl implements VendorService {

    private final VendorRepository vendorRepository;
    private final TicketRepository ticketRepository;

    public VendorServiceImpl(VendorRepository vendorRepository, TicketRepository ticketRepository) {
        this.vendorRepository = vendorRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Vendor getVendorById(int id) {
        return vendorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vendor not found with ID: " + id));
    }

    @Override
    public Vendor addVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public Ticket addTicketForVendor(int vendorId, Ticket ticket) {
        Vendor vendor = getVendorById(vendorId);
        ticket.setVendor(vendor);
        ticket.setStatus(TicketStatus.AVAILABLE);
        return ticketRepository.save(ticket);
    }
}

