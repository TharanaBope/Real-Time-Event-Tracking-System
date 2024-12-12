package com.tharana.oop_backend.model;

import javax.persistence.*;
// Model class for ticket
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String eventName;
    private boolean isSold;

    public Ticket() {
    }

    public Ticket(String eventName, boolean isSold) {
        this.eventName = eventName;
        this.isSold = isSold;
    }

    public int getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }
}
