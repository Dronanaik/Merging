//package Test;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class Customer {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner scanner = new Scanner(System.in);
//        
//        // Create an array to store customer data (id, name, age, address)
//        Object[][] customerData = new Object[3][4]; // 3 customers, 4 attributes (id, name, age, address)
//        
//        try {
//            String username = "root";
//            String password = "pass@word1";
//            String url = "jdbc:mysql://localhost:3306/kpmg";
//            
//            // Establish the connection
//            Connection con = DriverManager.getConnection(url, username, password);
//            System.out.println("Connection Successful");
//
//            // Taking user input for 3 customers
//            for (int i = 0; i < 3; i++) {
//                System.out.println("\nEnter details for customer " + (i + 1) + ":");
//                
//                System.out.print("Enter customer id: ");
//                int id = scanner.nextInt();
//                scanner.nextLine();  // Consume the newline character after nextInt()
//                
//                System.out.print("Enter customer name: ");
//                String name = scanner.nextLine();
//                
//                System.out.print("Enter customer age: ");
//                int age = scanner.nextInt();
//                scanner.nextLine();  // Consume the newline character after nextInt()
//
//                System.out.print("Enter customer address: ");
//                String address = scanner.nextLine();
//
//                // Store the input data in the array
//                customerData[i][0] = id;
//                customerData[i][1] = name;
//                customerData[i][2] = age;
//                customerData[i][3] = address;
//
//                // SQL insert query using user inputs
//                String query = "INSERT INTO customer1 (id, name, age, address) " +
//                               "VALUES (" + id + ", '" + name + "', " + age + ", '" + address + "')";
//                
//                // Create a statement
//                Statement s1 = con.createStatement();
//                
//                // Execute the insert query
//                int rowsAffected = s1.executeUpdate(query);
//                
//                // Check if insertion was successful
//                if (rowsAffected > 0) {
//                    System.out.println("Data inserted successfully for customer " + (i + 1));
//                } else {
//                    System.out.println("Data insertion failed for customer " + (i + 1));
//                }
//            }
//
//            // Optionally, you can also verify by querying the data
//            String selectQuery = "SELECT * FROM customer1";
//            Statement s1 = con.createStatement();
//            ResultSet rs = s1.executeQuery(selectQuery);
//            
//            // Display the result of the query
//            System.out.println("\nDisplaying all customers from the database:");
//            while (rs.next()) {
//                int dbId = rs.getInt(1);
//                String dbName = rs.getString(2);
//                int dbAge = rs.getInt(3);
//                String dbAddress = rs.getString(4);
//                System.out.println(dbId + " " + dbName + " " + dbAge + " " + dbAddress);
//                System.out.println("-----------------------------------------");
//            }
//            
//            
//            // Close the connection
//            con.close();
//            scanner.close();  // Close the scanner
//
//        } catch (SQLException e) {
//            // Handle SQL exceptions
//            e.printStackTrace();
//        }
//        
//        
//    }
//}


package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store customer data (id, name, age, address)
        Object[][] customerData = new Object[3][4]; // 3 customers, 4 attributes (id, name, age, address)
        
        try {
            String username = "root";
            String password = "pass@word1";
            String url = "jdbc:mysql://localhost:3306/kpmg";
            
            // Establish the connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");

            // Taking user input for 3 customers
            for (int i = 0; i < 3; i++) {
                System.out.println("\nEnter details for customer " + (i + 1) + ":");
                
                System.out.print("Enter customer id: ");
                int id = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character after nextInt()
                
                System.out.print("Enter customer name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter customer age: ");
                int age = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character after nextInt()

                System.out.print("Enter customer address: ");
                String address = scanner.nextLine();

                // Store the input data in the array
                customerData[i][0] = id;
                customerData[i][1] = name;
                customerData[i][2] = age;
                customerData[i][3] = address;

                // SQL insert query using user inputs
                String query = "INSERT INTO customer1 (id, name, age, address) " +
                               "VALUES (" + id + ", '" + name + "', " + age + ", '" + address + "')";
                
                // Create a statement
                Statement s1 = con.createStatement();
                
                // Execute the insert query
                int rowsAffected = s1.executeUpdate(query);
                
                // Check if insertion was successful
                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully for customer " + (i + 1));
                } else {
                    System.out.println("Data insertion failed for customer " + (i + 1));
                }
            }

            // Prompt user for update action
            System.out.println("\nDo you want to update any customer information? (yes/no)");
            String updateChoice = scanner.nextLine();
            
            if (updateChoice.equalsIgnoreCase("yes")) {
                // Get the customer ID to update
                System.out.print("Enter the customer ID to update: ");
                int customerIdToUpdate = scanner.nextInt();
                scanner.nextLine();  // Consume newline character

                // Prompt the user for the attribute to update
                System.out.println("Which attribute would you like to update?");
                System.out.println("1. Name");
                System.out.println("2. Age");
                System.out.println("3. Address");
                System.out.print("Enter choice (1, 2, or 3): ");
                int attributeChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline character

                // Define the query string and new value based on the user's choice
                String columnToUpdate = "";
                String newValue = "";

                if (attributeChoice == 1) {
                    columnToUpdate = "name";
                    System.out.print("Enter new name: ");
                    newValue = scanner.nextLine();
                } else if (attributeChoice == 2) {
                    columnToUpdate = "age";
                    System.out.print("Enter new age: ");
                    newValue = scanner.nextLine();
                } else if (attributeChoice == 3) {
                    columnToUpdate = "address";
                    System.out.print("Enter new address: ");
                    newValue = scanner.nextLine();
                } else {
                    System.out.println("Invalid choice.");
                    return;
                }

                // Construct the update query
                String updateQuery = "UPDATE customer1 SET " + columnToUpdate + " = ? WHERE id = ?";

                // Execute the update query using PreparedStatement
                PreparedStatement ps = con.prepareStatement(updateQuery);
                
                // Set the parameters for the PreparedStatement
                if (columnToUpdate.equals("age")) {
                    ps.setInt(1, Integer.parseInt(newValue));  // For age, set it as an integer
                } else {
                    ps.setString(1, newValue);  // For name and address, set it as a string
                }
                ps.setInt(2, customerIdToUpdate);

                // Execute the update query
                int rowsUpdated = ps.executeUpdate();
                
                // Check if the update was successful
                if (rowsUpdated > 0) {
                    System.out.println("Customer information updated successfully.");
                } else {
                    System.out.println("No customer found with ID " + customerIdToUpdate);
                }
            }

            // Optionally, you can also verify by querying the data
            String selectQuery = "SELECT * FROM customer1";
            Statement s1 = con.createStatement();
            ResultSet rs = s1.executeQuery(selectQuery);
            
            // Display the result of the query
            System.out.println("\nDisplaying all customers from the database:");
            while (rs.next()) {
                int dbId = rs.getInt(1);
                String dbName = rs.getString(2);
                int dbAge = rs.getInt(3);
                String dbAddress = rs.getString(4);
                System.out.println(dbId + " " + dbName + " " + dbAge + " " + dbAddress);
                System.out.println("-----------------------------------------");
            }
            
            
            // Close the connection
            con.close();
            scanner.close();  // Close the scanner

        } catch (SQLException e) {
            // Handle SQL exceptions
            e.printStackTrace();
        }
    }
}
