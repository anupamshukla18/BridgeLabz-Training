package com.junittesting.filehandling;

import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import org.junit.Test;

public class FileProcessorTest {

	@Test
	public void testWriteAndRead() throws IOException {
		FileProcessor processor = new FileProcessor();
		processor.writeToFile("test.txt", "JUnit");

		assertTrue(new File("test.txt").exists());
		assertEquals("JUnit", processor.readFromFile("test.txt"));
	}

	@Test(expected = IOException.class)
	public void testFileNotFound() throws IOException {
		FileProcessor processor = new FileProcessor();
		processor.readFromFile("missing.txt");
	}
}
