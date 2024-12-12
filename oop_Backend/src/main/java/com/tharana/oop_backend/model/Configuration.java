package com.tharana.oop_backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int totalTickets;
    private int vendorThreads;
    private int customerThreads;

    public Configuration() {
    }

    public Configuration(int totalTickets, int vendorThreads, int customerThreads) {
        this.totalTickets = totalTickets;
        this.vendorThreads = vendorThreads;
        this.customerThreads = customerThreads;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getVendorThreads() {
        return vendorThreads;
    }

    public void setVendorThreads(int vendorThreads) {
        this.vendorThreads = vendorThreads;
    }

    public int getCustomerThreads() {
        return customerThreads;
    }

    public void setCustomerThreads(int customerThreads) {
        this.customerThreads = customerThreads;
    }
}
