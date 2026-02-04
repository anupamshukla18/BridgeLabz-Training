package com.smartcitytransport.model;

import java.time.LocalTime;

public class TransportSchedule {

    private String serviceName;
    private LocalTime departureTime;
    private double fare;

    public TransportSchedule(String serviceName,
                             LocalTime departureTime,
                             double fare) {
        this.serviceName = serviceName;
        this.departureTime = departureTime;
        this.fare = fare;
    }

    public String getServiceName() {
        return serviceName;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return serviceName +
                " | Departure: " + departureTime +
                " | Fare: " + fare;
    }
}
