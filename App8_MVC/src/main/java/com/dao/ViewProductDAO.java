package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.bean.ProductBean;

public class ViewProductDAO 
{
	ArrayList<ProductBean> al = new ArrayList<ProductBean>();
	
	public ArrayList<ProductBean> reterive_productData()
	{
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement  pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				ProductBean bean = new ProductBean();
				bean.setProduct_id(rs.getString(1));
				bean.setProduct_name(rs.getString(2));
				bean.setProduct_company(rs.getString(3));
				bean.setProduct_price(rs.getString(4));
				bean.setProduct_quantity(rs.getString(5));
				
				al.add(bean);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}
}
