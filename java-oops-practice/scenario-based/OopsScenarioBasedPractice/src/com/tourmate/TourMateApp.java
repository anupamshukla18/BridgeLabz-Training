package com.tourmate;
public class TourMateApp {
    public static void main(String[] args) {

        Transport transport = new Transport(15000);
        Hotel hotel = new Hotel(20000);
        Activity activity = new Activity(5000);

        Trip trip1 = new DomesticTrip(
                "Goa", 5, transport, hotel, activity);

        Trip trip2 = new InternationalTrip(
                "Paris", 7,
                new Transport(60000),
                new Hotel(80000),
                new Activity(20000));

        trip1.book();
        System.out.println();

        trip2.book();
    }
}
