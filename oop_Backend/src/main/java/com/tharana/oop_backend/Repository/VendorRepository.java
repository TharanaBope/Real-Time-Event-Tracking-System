package com.tharana.oop_backend.Repository;

import com.tharana.oop_backend.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer> {

    // Custom query to find a vendor by name (case-insensitive)
    Vendor findByNameIgnoreCase(String name);
}

