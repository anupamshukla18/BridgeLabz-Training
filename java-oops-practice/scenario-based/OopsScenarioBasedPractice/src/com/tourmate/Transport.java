package com.tourmate;
class Transport {
    private double cost;

    public Transport(double cost) {
        this.cost = cost;
    }

    double getCost() {   // package-private (hidden from outside world)
        return cost;
    }
}
