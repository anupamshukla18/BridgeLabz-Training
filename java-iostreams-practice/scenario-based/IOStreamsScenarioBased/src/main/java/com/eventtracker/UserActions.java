package com.eventtracker;

public class UserActions {

	@AuditTrail(action = "USER_LOGIN")
	public void login() {
	}

	@AuditTrail(action = "FILE_UPLOAD")
	public void uploadFile() {
	}

	@AuditTrail(action = "FILE_DELETE")
	public void deleteFile() {
	}

	// Not audited
	public void viewProfile() {
	}
}
