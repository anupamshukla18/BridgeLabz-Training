package com.streams;

import java.io.*;

public class BufferedFileCopy {

	private static final int BUFFER_SIZE = 4096;

	public static void main(String[] args) {

		File source = new File("D:\\File Handling\\bigfile.dat");
		File dest = new File("D:\\File Handling\\bigfile_copy.dat");

		long startTime = System.nanoTime();

		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;

			// Read and write in chunks
			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		System.out.println("Time taken (ms): " + (endTime - startTime) / 1_000_000);
	}
}
