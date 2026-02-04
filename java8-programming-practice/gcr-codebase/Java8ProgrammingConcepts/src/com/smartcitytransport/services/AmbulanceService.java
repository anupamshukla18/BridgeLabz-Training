package com.smartcitytransport.services;

import com.smartcitytransport.interfaces.EmergencyService;
import com.smartcitytransport.interfaces.TransportService;

public class AmbulanceService
        implements TransportService, EmergencyService {

    @Override
    public String getServiceName() {
        return "Ambulance";
    }

    @Override
    public double getFare() {
        return 0.0;
    }
}
