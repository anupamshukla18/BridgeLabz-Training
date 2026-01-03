package com.oopspillars.ridehailingapplication;

public interface GPS {
    // for getting the current location
    String getCurrentLocation();

    // for updating the location 
    void updateLocation(String newLocation);
}
