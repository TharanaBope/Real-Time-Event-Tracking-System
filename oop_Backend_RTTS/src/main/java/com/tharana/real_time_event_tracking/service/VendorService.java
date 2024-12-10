package com.tharana.real_time_event_tracking.service;

import com.tharana.real_time_event_tracking.entity.Ticket;
import com.tharana.real_time_event_tracking.entity.Vendor;
import com.tharana.real_time_event_tracking.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class VendorService {
    private final TicketPool ticketPool;
    private final List<Thread> vendorThreads = new ArrayList<>();
    private volatile boolean running = false;

    @Autowired
    private VendorRepository vendorRepository;

    @Autowired
    public VendorService(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    public void startVendors(int vendorCount, int ticketReleaseRate) {
        if (running) {
            throw new IllegalStateException("Vendors are already running.");
        }

        running = true;

        for (int i = 1; i <= vendorCount; i++) {
            Vendor vendor = new Vendor();
            vendor.setName("Vendor-" + i);
            vendorRepository.save(vendor);

            Long vendorId = vendor.getId();

            Thread vendorThread = new Thread(() -> runVendor(ticketReleaseRate, vendorId));
            vendorThreads.add(vendorThread);
            vendorThread.start();
        }
    }

    private void runVendor(int ticketReleaseRate, Long vendorId) {
        Random random = new Random();
        while (running) {
            try {
                int ticketId = random.nextInt(1000);
                Ticket ticket = new Ticket((long) ticketId, vendorId);

                boolean added = ticketPool.addTicket(ticket);
                if (added) {
                    System.out.println("Vendor " + vendorId + " added ticket: " + ticketId);
                }
                Thread.sleep(ticketReleaseRate);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public void stopVendors() {
        running = false;
        synchronized (ticketPool) {
            ticketPool.notifyAll();
        }
        vendorThreads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        vendorThreads.clear();
    }
}

