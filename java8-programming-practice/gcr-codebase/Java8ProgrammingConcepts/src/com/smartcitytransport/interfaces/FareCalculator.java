package com.smartcitytransport.interfaces;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance);
}
