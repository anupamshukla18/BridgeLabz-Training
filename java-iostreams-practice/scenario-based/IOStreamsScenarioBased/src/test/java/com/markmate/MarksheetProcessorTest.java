package com.markmate;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class MarksheetProcessorTest {

	@Test
	public void testCSVProcessing() {
		StudentReport report = MarksheetProcessor.processCSV("student_marks.csv");
		assertNotNull(report);
	}
}
