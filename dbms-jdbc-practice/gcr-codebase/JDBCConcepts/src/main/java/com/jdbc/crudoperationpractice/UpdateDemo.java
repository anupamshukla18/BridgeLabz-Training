package com.jdbc.crudoperationpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.establishconnection.DatabaseConnection;

public class UpdateDemo {

	public static void updateStudentGrade(int id, String newGrade) {

		String sql = "UPDATE students SET grade = ? WHERE id = ?";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, newGrade);
			pstmt.setInt(2, id);

			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " row(s) updated successfully!");

		} catch (SQLException e) {
			System.err.println("Update failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		updateStudentGrade(1, "A");
	}
}