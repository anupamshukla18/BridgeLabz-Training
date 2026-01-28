package com.healthcheckpro;

import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;
import org.junit.Test;
import com.healthcheckpro.PublicAPI;
import com.healthcheckpro.LabTestController;

public class HealthCheckProScannerTest {

	@Test
	public void testPublicAPIPresent() {

		Method[] methods = LabTestController.class.getDeclaredMethods();
		boolean found = false;

		for (Method method : methods) {
			if (method.getName().equals("getAllLabTests") && method.isAnnotationPresent(PublicAPI.class)) {
				found = true;
			}
		}

		assertTrue("PublicAPI annotation should be present", found);
	}
}
