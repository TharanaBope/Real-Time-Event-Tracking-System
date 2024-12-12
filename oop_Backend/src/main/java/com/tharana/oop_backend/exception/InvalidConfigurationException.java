package com.tharana.oop_backend.exception;
/**
 * Custom exception for invalid configuration errors in the ticketing simulation.
 */
public class InvalidConfigurationException extends RuntimeException {

    public InvalidConfigurationException(String message) {
        super(message);
    }

    public InvalidConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}

