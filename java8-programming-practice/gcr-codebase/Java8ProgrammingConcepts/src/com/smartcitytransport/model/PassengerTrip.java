package com.smartcitytransport.model;

public class PassengerTrip {

    private String route;
    private double fare;
    private boolean peakHour;

    public PassengerTrip(String route,
                         double fare,
                         boolean peakHour) {
        this.route = route;
        this.fare = fare;
        this.peakHour = peakHour;
    }

    public String getRoute() {
        return route;
    }

    public double getFare() {
        return fare;
    }

    public boolean isPeakHour() {
        return peakHour;
    }
}
