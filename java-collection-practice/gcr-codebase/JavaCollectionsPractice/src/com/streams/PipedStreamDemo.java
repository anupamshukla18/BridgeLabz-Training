package com.streams;

import java.io.*;

public class PipedStreamDemo {

	public static void main(String[] args) throws IOException {

		PipedOutputStream pos = new PipedOutputStream();
		PipedInputStream pis = new PipedInputStream(pos);

		// Writer thread
		new Thread(() -> {
			try {
				pos.write("Hello from writer thread".getBytes());
				pos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}).start();

		// Reader thread
		new Thread(() -> {
			try {
				int data;
				while ((data = pis.read()) != -1) {
					System.out.print((char) data);
				}
				pis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}).start();
	}
}
