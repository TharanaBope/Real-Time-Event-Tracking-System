package com.tharana.real_time_event_tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketingService {
    private final VendorService vendorService;
    private final ConsumerService consumerService;

    @Autowired
    public TicketingService(VendorService vendorService, ConsumerService consumerService) {
        this.vendorService = vendorService;
        this.consumerService = consumerService;
    }

    public void startSimulation(int vendorCount, int ticketReleaseRate, int consumerCount, int retrievalRate) {
        vendorService.startVendors(vendorCount, ticketReleaseRate);
        consumerService.startConsumers(consumerCount, retrievalRate);
    }

    public void stopSimulation() {
        vendorService.stopVendors();
        consumerService.stopConsumers();
    }
}
