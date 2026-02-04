package com.smartcitytransport.services;

import com.smartcitytransport.interfaces.TransportService;

public class BusService implements TransportService {

    @Override
    public String getServiceName() {
        return "City Bus";
    }

    @Override
    public double getFare() {
        return 20.0;
    }
}
