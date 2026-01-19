package com.generics.resumescreening;
import java.util.List;

class ScreeningPipeline {

    public static void processAll(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening role: " + role.getRoleName());
        }
    }
}
