package com.jspiders.cardekho.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.cardekho.JDBC.Carjdbc;

@WebServlet("/delete_car")
public class DeleteCar extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String carId = req.getParameter("carId");

	        Carjdbc.deleteCarRecord(carId);

	        resp.sendRedirect("search_cars");
	}

}
