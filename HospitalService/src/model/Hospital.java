package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Hospital {
	//connection class created
		private Connection connect()
		 {
		 Connection con = null;
		 try
		 {
		 Class.forName("com.mysql.jdbc.Driver");

		 //Provide the correct details: DBServer/DBName, username, password
		 con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/paf_ca", "root", "8172429Amma*");
		 }
		 catch (Exception e)
		 {e.printStackTrace();}
		 return con;
		 } 
}
