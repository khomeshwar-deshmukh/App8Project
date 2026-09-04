package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.bean.ProductBean;

public class AddProductDAO 
{

	public int insertProduct(ProductBean pb)
	{
		int rowCount=0;
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?,?,?)");
			pstmt.setString(1, pb.getProduct_id());
			pstmt.setString(2, pb.getProduct_name());
			pstmt.setString(3, pb.getProduct_company());
			pstmt.setString(4, pb.getProduct_price());
			pstmt.setString(5, pb.getProduct_quantity());
			
			rowCount = pstmt.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}
}
