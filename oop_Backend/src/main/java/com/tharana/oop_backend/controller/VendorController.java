package com.tharana.oop_backend.controller;

import com.tharana.oop_backend.entity.Ticket;
import com.tharana.oop_backend.entity.Vendor;
import com.tharana.oop_backend.service.VendorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {

    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    // Fetch a vendor by ID
    @GetMapping("/{id}")
    public ResponseEntity<Vendor> getVendorById(@PathVariable int id) {
        return ResponseEntity.ok(vendorService.getVendorById(id));
    }

    // Add a new vendor
    @PostMapping
    public ResponseEntity<Vendor> addVendor(@RequestBody Vendor vendor) {
        return ResponseEntity.ok(vendorService.addVendor(vendor));
    }

    // Vendor adds a ticket
    @PostMapping("/{id}/tickets")
    public ResponseEntity<Ticket> addTicketForVendor(
            @PathVariable int id,
            @RequestBody Ticket ticket
    ) {
        return ResponseEntity.ok(vendorService.addTicketForVendor(id, ticket));
    }
}
