package Neha.Oracle.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {


		public void selectAllEmployees(int empId) {
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
				System.out.println("Connected to DB Sucessfully");
						String sqlQuerry="select * from employee";
						Statement stmt = con.createStatement();
						ResultSet rs = stmt.executeQuery(sqlQuerry);
						while(rs.next()) {
							System.out.println(rs.getInt("empId")+" \t"+rs.getString("name")+" \t"+rs.getFloat("salary"));
							System.out.println();
							
							
						}
						con.commit();
						con.close();
		 }catch (ClassNotFoundException | SQLException e) {
e.printStackTrace();
	}

	}
		
		public void selectEmployeeById() {
			 try {
				 Class.forName("oracle.jdbc.driver.OracleDriver");  
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
					System.out.println("Connected to DB Sucessfully");
							String sqlQuerry="select * from employee";
							Statement stmt = con.createStatement();
							ResultSet rs = stmt.executeQuery(sqlQuerry);
							String name;
							float salary;
							if(rs.next()) {
						name=	rs.getString("name");
						salary=	rs.getFloat("salary");
								System.out.println();
								
								
							}
							con.commit();
							con.close();
			 }catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
		}

		}
public void insertEmployee(int empId,String name,float salary) {
	
	try {
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
			System.out.println("Connected to DB Sucessfully");
					String sqlInsertedQuery="insert into employee values(" + empId + "," + name + "," + salary + ")";
					Statement stmt = con.createStatement();
					int value = stmt.executeUpdate(sqlInsertedQuery);
					if (value>0) {
						
						System.out.println("Data Inserted Successfully");
						
						
					}
					con.commit();
					con.close();
	 }catch (ClassNotFoundException | SQLException e) {
e.printStackTrace();
}
}}
