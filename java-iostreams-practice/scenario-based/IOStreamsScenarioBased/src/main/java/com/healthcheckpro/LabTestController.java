package com.healthcheckpro;

import com.healthcheckpro.PublicAPI;
import com.healthcheckpro.RequiresAuth;

public class LabTestController {

	@PublicAPI(description = "Fetch all lab tests")
	public void getAllLabTests() {
	}

	@RequiresAuth(role = "PATIENT")
	public void bookLabTest() {
	}

	// Missing annotation (should be detected)
	public void downloadReport() {
	}
}
