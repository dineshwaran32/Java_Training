package Day9;

import java.util.*;
import java.sql.*;

public class P1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scr = new Scanner(System.in);
		boolean val = true;
		Connection con;
		Statement st;
		PreparedStatement ps;
		int i;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			System.out.println("Error");
		}

		do {
			System.out.println("Enter the operation");
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Display");
			System.out.println("5.Create");
			System.out.println("6.Exit");
			int ch = scr.nextInt();

			switch (ch)

			{
			case 1:
				System.out.println("In Insert ");
				System.out.println("Enter rollnumber : ");
				String rno = scr.next();
				System.out.println("Enter name : ");
				String n = scr.next();
				System.out.println("Enter age : ");
				int age = scr.nextInt();
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3309/Student", "root", "dbms");
					st = con.createStatement();
					i = st.executeUpdate("INSERT INTO Classroom VALUES ('" + rno + "', '" + n + "', " + age + ")");
					 
					
					System.out.println("Inserted successfully");
				} catch (SQLException e) {
					System.out.println(e);
				}
				break;

			case 2:
				System.out.println("In Update");
				System.out.println("Enter rollnumber : ");
				rno = scr.next();
				System.out.println("Enter name : ");
				n = scr.next();
				System.out.println("Enter age : ");
				age = scr.nextInt();
				
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3309/Student", "root", "dbms");
					st = con.createStatement();
					i = st.executeUpdate("UPDATE Classroom set Name = '"+n +"' , age = "+age+" where Rollnumber = '"+rno+"'");
					if(i==1) {
						System.out.println("Record Modified. ");
					}
				} catch (SQLException e) {
					System.out.println("Error occured in updating DB");
				}
				break;

			case 3:
				System.out.println("In Delete");
				System.out.println("Enter rollnumber : ");
				rno = scr.next();
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3309/Student", "root", "dbms");
					st = con.createStatement();
					st.executeUpdate("DELETE FROM Classroom where Rollnumber = '"+rno+"'");
				} catch (SQLException e) {
					System.out.println("Error occured in deleting DB");
				}
				System.out.println("Deleted successfully");
				break;

			case 4:
				System.out.println("In display");
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3309/Student", "root", "dbms");
					st = con.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM Classroom");
					int j = 1;
					while(rs.next()) {
						System.out.println("Record : "+j);
						System.out.println("Name : " +rs.getString("Name"));
						System.out.println("Roll  number : "+rs.getString("Rollnumber"));
						System.out.println("Age : "+rs.getInt("age"));
						j++;
						System.out.println();
					}
					rs.close();
					
				} catch (SQLException e) {
					System.out.println("Error occured in displaying DB");
				}
				break;

			case 5:
				System.out.println("In create");
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3309/Student", "root", "dbms");
					st = con.createStatement();
					st.executeUpdate("Create table Classroom(Rollnumber varchar(50) , Name varchar(255) , age int)");
					System.out.println("Connection created ");
					con.close();
				} catch (SQLException e) {
					System.out.println("Error occured in connecting DB");
				}
				break;

			case 6:
				val = false;
				break;
			}

		} while (val);
	}

}
