package com.reflection.basiclevel;

import java.lang.reflect.Field;

public class ReflectionPrivateFieldDemo {

	// Inner Person class
	static class Person {
		private int age;

		Person(int age) {
			this.age = age;
		}
	}

	public static void main(String[] args) {

		try {
			// Create Person object
			Person person = new Person(25);

			// Get Class object
			Class<?> cls = person.getClass();

			// Access private field "age"
			Field ageField = cls.getDeclaredField("age");
			ageField.setAccessible(true);

			// Get original value
			System.out.println("Original Age: " + ageField.get(person));

			// Modify private field
			ageField.set(person, 30);

			// Get updated value
			System.out.println("Updated Age: " + ageField.get(person));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
