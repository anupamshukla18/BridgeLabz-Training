package com.junittesting.performance;

import org.junit.Test;

public class PerformanceTest {

	// should fail (takes more than 2 seconds)
	@Test(timeout = 2000)
	public void testLongRunningTask() throws InterruptedException {
		Thread.sleep(3000);
	}
}
