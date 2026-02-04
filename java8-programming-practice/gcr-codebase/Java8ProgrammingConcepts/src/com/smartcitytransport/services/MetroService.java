package com.smartcitytransport.services;

import com.smartcitytransport.interfaces.TransportService;

public class MetroService implements TransportService {

    @Override
    public String getServiceName() {
        return "Metro Rail";
    }

    @Override
    public double getFare() {
        return 35.0;
    }
}
