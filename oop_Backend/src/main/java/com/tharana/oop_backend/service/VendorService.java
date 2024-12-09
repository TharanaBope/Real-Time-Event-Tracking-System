package com.tharana.oop_backend.service;

import com.tharana.oop_backend.entity.Ticket;
import com.tharana.oop_backend.entity.Vendor;

public interface VendorService {
    Vendor getVendorById(int id);
    Vendor addVendor(Vendor vendor);
    Ticket addTicketForVendor(int vendorId, Ticket ticket);
}
