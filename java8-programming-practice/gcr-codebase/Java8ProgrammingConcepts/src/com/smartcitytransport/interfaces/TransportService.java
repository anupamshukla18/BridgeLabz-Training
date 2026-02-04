package com.smartcitytransport.interfaces;

public interface TransportService {

    String getServiceName();
    double getFare();

    default void printServiceDetails() {
        System.out.println(
                "Service: " + getServiceName() +
                ", Fare: " + getFare()
        );
    }
}
