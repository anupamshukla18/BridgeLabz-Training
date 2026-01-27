package com.junittesting.exception;

import static org.junit.Assert.*;
import org.junit.Test;

public class ExceptionTest {

	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		Exception calculator = new Exception();
		calculator.divide(10, 0);
	}
}
