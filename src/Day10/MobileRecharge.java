package Day10;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class MobileRecharge {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner s = new Scanner(System.in);
        int ch;
        Connection con;
        Statement st;
        int i;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Error loading driver: " + e);
        }

        do {
            System.out.println("1. Create Tables");
            System.out.println("2. Register User");
            System.out.println("3. Initiate Recharge");
            System.out.println("4. View Transaction History");
            System.out.println("5. Update Payment Method");
            System.out.println("6. Delete Account");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Creating Tables...");
                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "dbms");
                        st = con.createStatement();
                        
                        // Create Users Table
                        st.executeUpdate("CREATE TABLE Users (User_id INT PRIMARY KEY, Name VARCHAR(50), Email VARCHAR(50), PaymentMethod VARCHAR(50))");

                        // Create Transactions Table
                        st.executeUpdate("CREATE TABLE Transactions (Trans_id INT PRIMARY KEY, User_id INT, Amount DOUBLE, Status VARCHAR(20), Date TIMESTAMP)");

                        // Create Plans Table
                        st.executeUpdate("CREATE TABLE Plans (Plan_id INT PRIMARY KEY, Plan_name VARCHAR(50), Price DOUBLE)");

                        System.out.println("Tables Created Successfully!");
                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                    break;

                case 2:
                    System.out.println("Registering User...");
                    System.out.print("User ID: ");
                    int user_id = s.nextInt();
                    System.out.print("Name: ");
                    s.nextLine(); // Consume newline
                    String name = s.nextLine();
                    System.out.print("Email: ");
                    String email = s.nextLine();
                    System.out.print("Payment Method: ");
                    String paymentMethod = s.nextLine();

                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "2004");
                        st = con.createStatement();

                        // Insert User
                        i = st.executeUpdate("INSERT INTO Users VALUES(" + user_id + ", '" + name + "', '" + email + "', '" + paymentMethod + "')");

                        System.out.println("User Registered Successfully!");
                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                    break;

                case 3:
                    System.out.println("Initiating Recharge...");
                    System.out.print("Transaction ID: ");
                    int trans_id = s.nextInt();
                    System.out.print("User ID: ");
                    user_id = s.nextInt();
                    System.out.print("Amount: ");
                    double amount = s.nextDouble();
                    System.out.print("Status: ");
                    s.nextLine(); // Consume newline
                    String status = s.nextLine();

                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "2004");
                        st = con.createStatement();

                        // Insert Transaction
                        i = st.executeUpdate("INSERT INTO Transactions VALUES(" + trans_id + ", " + user_id + ", " + amount + ", '" + status + "', NOW())");

                        System.out.println("Recharge Initiated Successfully!");
                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                    break;

                case 4:
                    System.out.println("Viewing Transaction History...");
                    System.out.print("Enter User ID: ");
                    user_id = s.nextInt();

                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "2004");
                        st = con.createStatement();

                        // Fetch Transactions for a User
                        rs = st.executeQuery("SELECT * FROM Transactions WHERE User_id=" + user_id);
                        System.out.println("Transactions for User ID " + user_id + ":");
                        while (rs.next()) {
                            System.out.println("Trans ID: " + rs.getInt("Trans_id") + ", Amount: " + rs.getDouble("Amount") + ", Status: " + rs.getString("Status") + ", Date: " + rs.getTimestamp("Date"));
                        }

                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                    break;

                case 5:
                    System.out.println("Updating Payment Method...");
                    System.out.print("Enter User ID: ");
                    user_id = s.nextInt();
                    System.out.print("Enter New Payment Method: ");
                    s.nextLine(); // Consume newline
                    String newPaymentMethod = s.nextLine();

                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "2004");
                        st = con.createStatement();

                        // Update Payment Method
                        i = st.executeUpdate("UPDATE Users SET PaymentMethod='" + newPaymentMethod + "' WHERE User_id=" + user_id);

                        System.out.println("Payment Method Updated Successfully!");
                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                    break;

                case 6:
                    System.out.println("Deleting Account...");
                    System.out.print("Enter User ID: ");
                    user_id = s.nextInt();

                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root","2004");
                        st = con.createStatement();

                        // Delete User Account
                        i = st.executeUpdate("DELETE FROM Users WHERE User_id=" + user_id);
                        System.out.println("Account Deleted Successfully!");
                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error: " + e);
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (ch != 7);
    }
}
