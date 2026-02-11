package com.jdbc.crudoperationpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.establishconnection.DatabaseConnection;

public class DeleteDemo {

	public static void deleteStudent(int id) {

		String sql = "DELETE FROM students WHERE id = ?";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, id);

			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " row(s) deleted successfully!");

		} catch (SQLException e) {
			System.err.println("Delete failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		deleteStudent(2);
	}
}