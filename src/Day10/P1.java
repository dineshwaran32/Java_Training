package Day10;

import java.sql.*;
import java.util.*;

public class P1 {
	static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/registration", "root", "dbms");
			if (con != null) {
				return con;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	static void CreateTable() {
		Connection con = connect();
		String query = "create table signup(id int,name varchar(30),password varchar(30))";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			System.out.println(ps);
			ps.executeUpdate();
			System.out.println("table created.");
			con.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	static void InsertTable() {
		int id;
		String username, password;
		Connection con = connect();
		Scanner s = new Scanner(System.in);
		System.out.println("enter ID :");
		id = s.nextInt();
		System.out.println("enter Name :");
		username = s.next();
		System.out.println("enter Password :");
		password = s.next();
		String query = "insert into signup (id,name,password) values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, username);
			ps.setString(3, password);

			ps.executeUpdate();
			System.out.println("Data inserted successfully!!\n");
			con.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	static void DeleteTable() {
		int id;
		Connection con = connect();
		Scanner s = new Scanner(System.in);
		System.out.println("enter ID :");
		id = s.nextInt();
		String query = "delete from signup where id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			con.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	static boolean updateTable(String u, String p) {
		Connection con = connect();
		String query = "UPDATE signup SET password = ? WHERE name = ?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, p);
			ps.setString(2, u);
			ps.executeUpdate();
			System.out.println("Update Successsfully!! \n ");
			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			System.out.println(e);
		}
		return false;
	}

	static void view() {
		Connection con = connect();
		String qry = "SELECT * from signup";
		try {
			PreparedStatement pt = con.prepareStatement(qry);
			ResultSet rs = pt.executeQuery();
			while (rs.next()) {
				System.out.println("Id : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Password : " + rs.getString(3));
				System.out.println();
			}
			con.close();
			pt.close();
		} catch (SQLException e) {
			System.out.println("Error occured in fetching data.");
		}
	}

	static boolean authenticateUser(String u, String p) {

		String sql = "SELECT * FROM signup WHERE name = ? AND password = ?";
		Connection con = connect();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, u);
			pstmt.setString(2, p);
			ResultSet rs = pstmt.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			System.out.println("Error occured in authetication");
		}
		return false;
	}

	public static void main(String args[]) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = s.nextLine();
		System.out.print("Enter password: ");
		String password = s.nextLine();
		if (authenticateUser(username, password)) {
			System.out.println("Login succeessfull ");
		} else {
			System.out.println("Incorrect credentials. Please reset your password.");

			System.out.print("Enter new password: ");
			String newPassword = s.nextLine();
			System.out.print("Confirm new password: ");
			String confirmPassword = s.nextLine();
			if (newPassword.equals(confirmPassword)) {
				if (updateTable(username, newPassword)) {
					System.out.println("Password reset successfully. Please log in again.");
					System.out.print("Enter username: ");
					username = s.nextLine();
					System.out.print("Enter password: ");
					password = s.nextLine();
					if (authenticateUser(username, password)) {
						System.out.println("Login successful! Welcome " + username);
					} else {
						System.out.println("Login failed. Exiting...");
					}
				} 
			} else {
				System.out.println("Passwords do not match. Exiting...");

			}
		}
	}
}