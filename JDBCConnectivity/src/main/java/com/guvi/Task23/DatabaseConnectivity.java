package com.guvi.Task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectivity {

	public static void main(String[] args) throws SQLException {
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","test");
		
		Statement statement = connect.createStatement();
		
		//for Insert
		//statement.execute("create table emp(empcode int(3) primary key, empname varchar(15), empage int(3), esalary int(5))");
		
		statement.execute("insert into emp(empcode,empname,empage,esalary) values(101,'Jenny',25,10000),(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000),(105,'Shameer',25,90000);");
		
		System.out.println("EOS");
		
	}

}
