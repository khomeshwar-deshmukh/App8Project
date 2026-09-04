package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ViewProductDAO;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProductServlet extends HttpServlet 
{
	@Override
  	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ArrayList<ProductBean> al = new ViewProductDAO().reterive_productData();
		req.setAttribute("list", al);
		req.getRequestDispatcher("ViewProduct.jsp").forward(req, resp);
	}
}
