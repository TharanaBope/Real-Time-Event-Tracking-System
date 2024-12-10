package com.tharana.real_time_event_tracking.service;

import com.tharana.real_time_event_tracking.entity.SystemConfig;
import com.tharana.real_time_event_tracking.repo.SystemConfigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemControlService {
    private final SystemConfigRepo configRepo;

    @Autowired
    public SystemControlService(SystemConfigRepo configRepo) {
        this.configRepo = configRepo;
    }

    public SystemConfig getConfiguration() {
        return configRepo.findById(1L).orElse(new SystemConfig());
    }

    public void updateConfiguration(SystemConfig config) {
        config.setId(1L); // Ensure only one configuration exists
        configRepo.save(config);
    }
}