package com.streams;

import java.io.*;

public class StudentDataStream {

	public static void main(String[] args) {

		// Writing primitive data
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\File Handling\\student.dat"))) {

			dos.writeInt(101);
			dos.writeUTF("Vikash");
			dos.writeDouble(8.5);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reading primitive data
		try (DataInputStream dis = new DataInputStream(new FileInputStream("D:\\File Handling\\student.dat"))) {

			int roll = dis.readInt();
			String name = dis.readUTF();
			double gpa = dis.readDouble();

			System.out.println(roll + " " + name + " " + gpa);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
