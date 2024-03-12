package com.jspiders.cardekho.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.cardekho.JDBC.Carjdbc;

@WebServlet("/update_car")
public class UpdateCar extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int carId = Integer.parseInt(req.getParameter("carId"));
	        String newName = req.getParameter("newName");
	        String newBrand = req.getParameter("newBrand");
	        double newPrice = Double.parseDouble(req.getParameter("newPrice"));

	        Carjdbc.updateCar(carId, newName, newBrand, newPrice);

	        resp.sendRedirect("search_cars");
	    }
	}


