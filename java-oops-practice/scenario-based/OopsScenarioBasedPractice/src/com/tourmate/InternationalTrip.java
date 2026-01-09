package com.tourmate;
class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked to " + destination);
        System.out.println("Passport & Visa verified.");
        System.out.println("Total Budget: ₹" + calculateTotalBudget());
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with charges.");
    }
}
