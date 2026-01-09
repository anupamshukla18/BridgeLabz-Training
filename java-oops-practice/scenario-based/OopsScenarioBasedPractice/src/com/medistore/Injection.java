package com.medistore;

import java.time.LocalDate;

class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate, int qty) {
        super(name, price, expiryDate, qty);
    }
}

