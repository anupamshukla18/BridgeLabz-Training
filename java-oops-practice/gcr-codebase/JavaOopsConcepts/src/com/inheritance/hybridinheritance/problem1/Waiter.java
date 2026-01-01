package com.inheritance.hybridinheritance.problem1;

public class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    //Override
    public void performDuties() {
        System.out.println("Waiter serves food to customers.");
    }
}