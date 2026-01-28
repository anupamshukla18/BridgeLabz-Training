package com.eventtracker;

import java.lang.reflect.Method;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class EventTrackerApp {

	public static void main(String[] args) {

		List<AuditLog> logs = new ArrayList<>();

		Class<?> clazz = UserActions.class;

		for (Method method : clazz.getDeclaredMethods()) {

			if (method.isAnnotationPresent(AuditTrail.class)) {

				AuditTrail audit = method.getAnnotation(AuditTrail.class);

				logs.add(new AuditLog(audit.action(), method.getName()));
			}
		}

		exportLogsToJson(logs);
		System.out.println("Audit log generated successfully ");
	}

	private static void exportLogsToJson(List<AuditLog> logs) {

		try (Writer writer = new FileWriter("audit_log.json")) {
			new Gson().toJson(logs, writer);
		} catch (Exception e) {
			throw new RuntimeException("Failed to write audit log", e);
		}
	}
}
