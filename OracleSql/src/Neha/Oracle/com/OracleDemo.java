package Neha.Oracle.com;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDemo {

	public static void main(String[] args) {
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
			  
			Statement stmt=(Statement) con.createStatement();  

			System.out.println("successfully connected ");
			  

			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
		
			  
			}}