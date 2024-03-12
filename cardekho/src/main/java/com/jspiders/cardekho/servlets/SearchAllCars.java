package com.jspiders.cardekho.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.cardekho.Car.Car;
import com.jspiders.cardekho.JDBC.Carjdbc;

@WebServlet("/search_cars")
public class SearchAllCars extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		List<Car> cars = Carjdbc.searchCars();
		req.setAttribute("cars", cars);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("search_cars.jsp");
		requestDispatcher.forward(req, resp);
	}

}
