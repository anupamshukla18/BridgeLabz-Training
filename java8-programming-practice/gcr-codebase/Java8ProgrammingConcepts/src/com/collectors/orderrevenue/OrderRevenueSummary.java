package com.collectors.orderrevenue;
import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Amit", 2500.50),
                new Order("Neha", 1800.00),
                new Order("Amit", 3200.75),
                new Order("Ravi", 1500.00),
                new Order("Neha", 2200.25)
        );

        // Sum order totals per customer
        Map<String, Double> revenuePerCustomer =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                Order::getCustomerName,
                                Collectors.summingDouble(Order::getOrderAmount)
                        ));

        System.out.println(revenuePerCustomer);
    }
}
