package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.AddProductDAO;

@SuppressWarnings("serial")
@WebServlet("/aps")
public class AddProductServlet extends HttpServlet
{
	@Override
  	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
        ProductBean bean = new ProductBean();
        bean.setProduct_id(req.getParameter("pId"));
        bean.setProduct_name(req.getParameter("pName"));
        bean.setProduct_company(req.getParameter("pComp"));
        bean.setProduct_price(req.getParameter("pPrise"));
        bean.setProduct_quantity(req.getParameter("pQua"));
        
        AddProductDAO daobj = new AddProductDAO();
        int rowCount = daobj.insertProduct(bean);
        
        if(rowCount>0)
        {
        	req.setAttribute("msg","Product Record Inserted Sucessfully");
			req.getRequestDispatcher("AddProduct.jsp").forward(req,resp);
        }
        else
        {
        	req.setAttribute("msg","Product Data NOT INSERTED!!!!");
			req.getRequestDispatcher("AddProduct.jsp").forward(req,resp);
        }
         
	}
	
}
