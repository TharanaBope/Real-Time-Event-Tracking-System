package com.tharana.real_time_event_tracking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;            // Primary key ID
    private Long ticketId;      // Business logic ID should also be Long for consistency
    private boolean available = true;
    private Long vendorId;      // Associate ticket with a vendor

    // Default constructor for JPA
    public Ticket() {}

    // Constructor that takes ticketId and vendorId
    public Ticket(Long ticketId, Long vendorId) {
        this.ticketId = ticketId;
        this.vendorId = vendorId;
        this.available = true; // Initially, all tickets are available
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public void markAsSold() {
        this.available = false;
    }
}
