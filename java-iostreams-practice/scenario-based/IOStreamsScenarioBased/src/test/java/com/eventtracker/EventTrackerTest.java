package com.eventtracker;

import static org.junit.Assert.assertEquals;
import java.lang.reflect.Method;
import org.junit.Test;

public class EventTrackerTest {

	@Test
	public void testAuditAnnotationCount() {

		int count = 0;

		for (Method m : UserActions.class.getDeclaredMethods()) {
			if (m.isAnnotationPresent(AuditTrail.class)) {
				count++;
			}
		}

		assertEquals(3, count);
	}
}
