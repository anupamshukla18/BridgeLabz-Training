package com.stringbuffer;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {

		int iterations = 1_000_000;

		// -------- StringBuffer Test   (Thread-safe, slower) --------
		StringBuffer stringBuffer = new StringBuffer();

		long startBuffer = System.nanoTime();

		for (int i = 0; i < iterations; i++) {
			stringBuffer.append("hello");
		}

		long endBuffer = System.nanoTime();
		long bufferTime = endBuffer - startBuffer;

		// -------- StringBuilder Test (Not thread-safe, faster) --------
		StringBuilder stringBuilder = new StringBuilder();

		long startBuilder = System.nanoTime();

		for (int i = 0; i < iterations; i++) {
			stringBuilder.append("hello");
		}

		long endBuilder = System.nanoTime();
		long builderTime = endBuilder - startBuilder;

		// -------- Output --------
		System.out.println("StringBuffer Time (ns): " + bufferTime);
		System.out.println("StringBuilder Time (ns): " + builderTime);

		if (bufferTime > builderTime) {
			System.out.println("StringBuilder is faster than StringBuffer");
		} else {
			System.out.println("StringBuffer is faster (rare case)");
		}
	}
}
