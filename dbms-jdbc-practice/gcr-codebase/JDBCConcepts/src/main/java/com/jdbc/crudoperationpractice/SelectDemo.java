package com.jdbc.crudoperationpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.establishconnection.DatabaseConnection;

public class SelectDemo {
	public static void getAllStudents() {
		String sql = "SELECT * FROM students";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Name: " + rs.getString("name"));
				System.out.println("Email: " + rs.getString("email"));
				System.out.println("Age: " + rs.getInt("age"));
				System.out.println("Grade: " + rs.getString("grade"));
				System.out.println("Enrollment Date: " + rs.getDate("enrollment_date"));
				System.out.println("-----------------------------------");
			}

		} catch (SQLException e) {
			System.err.println("Select failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getAllStudents();
	}
}