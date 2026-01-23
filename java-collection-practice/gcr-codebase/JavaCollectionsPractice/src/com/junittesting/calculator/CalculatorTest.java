package com.junittesting.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	// test add method
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.add(5, 5));
	}

	// test subtract method
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.subtract(5, 3));
	}

	// test multiply method
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		assertEquals(15, calculator.multiply(5, 3));
	}

	// test divide method
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.divide(10, 5));
	}

	// test divide by zero
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		Calculator calculator = new Calculator();
		calculator.divide(10, 0);
	}
}
