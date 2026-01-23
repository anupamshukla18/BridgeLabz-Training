package com.junittesting.stringutils;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testReverse() {
		StringUtils utils = new StringUtils();
		assertEquals("avaJ", utils.reverse("Java"));
	}

	@Test
	public void testPalindrome() {
		StringUtils utils = new StringUtils();
		assertTrue(utils.isPalindrome("madam"));
		assertFalse(utils.isPalindrome("java"));
	}

	@Test
	public void testUpperCase() {
		StringUtils utils = new StringUtils();
		assertEquals("HELLO", utils.toUpperCase("hello"));
	}
}
