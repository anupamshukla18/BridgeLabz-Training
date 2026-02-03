package com.streamapi.namedisplay;

import java.util.*;

public class CustomerMain {

	public static void main(String[] args) {

		List<String> customerNames = Arrays.asList("anuj", "rohit", "priya", "neha", "amit");

		CustomerService service = new CustomerService();

		List<String> formattedNames = service.getFormattedCustomerNames(customerNames);

		formattedNames.forEach(System.out::println);
	}
}
