package com.tharana.oop_backend.controller;

import com.tharana.oop_backend.entity.Customer;
import com.tharana.oop_backend.entity.Ticket;
import com.tharana.oop_backend.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Fetch a customer by ID
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    // Add a new customer
    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.addCustomer(customer));
    }

    // Customer purchases tickets
    @PostMapping("/{id}/purchase")
    public ResponseEntity<List<Ticket>> purchaseTickets(
            @PathVariable int id,
            @RequestParam int numberOfTickets
    ) {
        return ResponseEntity.ok(customerService.purchaseTickets(id, numberOfTickets));
    }
}
