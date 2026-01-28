package com.eventtracker;

import java.time.LocalDateTime;

public class AuditLog {

	String action;
	String methodName;
	String timestamp;

	public AuditLog(String action, String methodName) {
		this.action = action;
		this.methodName = methodName;
		this.timestamp = LocalDateTime.now().toString();
	}
}
