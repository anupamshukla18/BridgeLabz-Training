package com.streamapi.namedisplay;

import java.util.*;
import java.util.stream.*;

public class CustomerService {

	public List<String> getFormattedCustomerNames(List<String> names) {

		return names.stream().map(String::toUpperCase) // transform to uppercase
				.sorted() // alphabetical order
				.collect(Collectors.toList());
	}
}
