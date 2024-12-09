package com.tharana.oop_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    private String event;

    private double price;

    @Enumerated(EnumType.STRING)
    private TicketStatus status; // Enum to represent ticket status (e.g., AVAILABLE, SOLD)

    @ManyToOne
    @JoinColumn(name = "vendor_id", nullable = false)
    private Vendor vendor; // Reference to the vendor who added the ticket
}
