package com.tharana.oop_backend.service;

import org.springframework.stereotype.Service;
// Service class for thread management
@Service
public class ThreadManagementService {

    public void stopThreads(Thread... threads) {
        for (Thread thread : threads) {
            if (thread != null && thread.isAlive()) {
                thread.interrupt();
            }
        }
    }
}
