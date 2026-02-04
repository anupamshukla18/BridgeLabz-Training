package com.smartcitytransport.services;

import com.smartcitytransport.interfaces.TransportService;

public class TaxiService implements TransportService {

    @Override
    public String getServiceName() {
        return "City Taxi";
    }

    @Override
    public double getFare() {
        return 60.0;
    }
}
