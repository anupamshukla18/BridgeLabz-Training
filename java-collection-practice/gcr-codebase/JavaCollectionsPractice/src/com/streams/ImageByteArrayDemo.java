package com.streams;

import java.io.*;

public class ImageByteArrayDemo {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("D:\\File Handling\\input.jpg");
				ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

			byte[] buffer = new byte[4096];
			int bytesRead;

			// Read image into byte array
			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}

			byte[] imageBytes = baos.toByteArray();

			// Write byte array back to image file
			try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
					FileOutputStream fos = new FileOutputStream("D:\\File Handling\\output.jpg")) {

				while ((bytesRead = bais.read(buffer)) != -1) {
					fos.write(buffer, 0, bytesRead);
				}
			}

			System.out.println("Image copied successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
