package Test;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class ConnectionExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			String username = "root";
//			String password = "pass@word1";
//			String url = "jdbc:mysql://localhost:3306/kpmg";
//			
//			Connection con = DriverManager.getConnection(url,username,password);
//			System.out.println("Connection Successful");
//			String query = "Select * from customer";
//			Statement s1 = con.createStatement();
//			s1.executeQuery(query);
//			ResultSet rs = s1.executeQuery(query);
//			while(rs.next()) {
//				int id= rs.getInt(1);
//				String name=rs.getString(2);
//				int age=rs.getInt(3);
//				String address=rs.getString(4);
//				System.out.println(id+" "+name+" "+age+" "+address+" ");
//				System.out.println("-----------------------------------------");		
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//}




