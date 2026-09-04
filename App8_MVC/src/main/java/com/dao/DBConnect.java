package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{

	private static Connection con = null; 
	private DBConnect() {}
	static
	{
		try
		{
			Class.forName(DBinfo.driver);
			con = DriverManager.getConnection(DBinfo.dbUrl,DBinfo.dbUname,DBinfo.dbUpwd);
			System.out.println("Database Connected!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
