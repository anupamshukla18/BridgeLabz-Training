package com.annotations.exerciseproblems;

import java.util.ArrayList;

public class SuppressWarningDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// Raw ArrayList (without generics)
		ArrayList list = new ArrayList();

		list.add("Java");
		list.add(100);
		list.add(45.5);

		// Access elements
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
