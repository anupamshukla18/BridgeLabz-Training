package com.healthcheckpro;

import java.lang.reflect.Method;


import com.healthcheckpro.PublicAPI;
import com.healthcheckpro.RequiresAuth;
import com.healthcheckpro.LabTestController;

public class HealthCheckProScanner {

	public static void main(String[] args) {

		Class<?> controllerClass = LabTestController.class;

		System.out.println("API Documentation for: " + controllerClass.getSimpleName());
		System.out.println("--------------------------------------");

		for (Method method : controllerClass.getDeclaredMethods()) {

			if (method.isAnnotationPresent(PublicAPI.class)) {
				PublicAPI api = method.getAnnotation(PublicAPI.class);
				System.out.println("PUBLIC API -> " + method.getName());
				System.out.println("Description: " + api.description());

			} else if (method.isAnnotationPresent(RequiresAuth.class)) {
				RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
				System.out.println("AUTH API -> " + method.getName());
				System.out.println("Role: " + auth.role());

			} else {
				System.out.println("WARNING -> " + method.getName() + " : Missing annotation");
			}

			System.out.println();
		}
	}
}
