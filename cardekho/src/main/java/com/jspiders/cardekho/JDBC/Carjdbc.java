package com.jspiders.cardekho.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspiders.cardekho.Car.Car;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class Carjdbc {
	
	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	private static ResultSet resultset;
	
	private static void open() throws SQLException {
		driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
		
	}
	
	private static void close() throws SQLException {
		if(preparedStatement!=null) {
			preparedStatement.close();
		}
		if(connection!=null) {
			connection.close();
		}
		
		DriverManager.deregisterDriver(driver);
		
	}

	public static int addCar(int id, String name, String brand, double price) {
		int res=0;
		     try {
		    	 open();
		    	 query="INSERT INTO car VALUES(?,?,?,?)";
		    	 preparedStatement=connection.prepareStatement(query);
		    	 preparedStatement.setInt(1, id);
		    	 preparedStatement.setString(2, name);
		    	 preparedStatement.setString(3, brand);
		    	 preparedStatement.setDouble(4, price);
		     res= preparedStatement.executeUpdate();
		  //  System.out.println(res+"rows affected");

		    } catch (Exception e) {
				// TODO: handle exception
			}
		    finally {
		    	 try {
					close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     }
	return res;
	}

	public static List<Car> searchCars() {
		List<Car> cars=new ArrayList<>();
		try {
			open();
			query="SELECT * FROM car";
			preparedStatement=connection.prepareStatement(query);
		   resultset=preparedStatement.executeQuery();
		 while(resultset.next()) {
			 Car car=new Car();
			 car.setId(resultset.getInt(1));
				car.setName(resultset.getString(2));
				car.setBrand(resultset.getString(3));
				car.setPrice(resultset.getDouble(4));
				cars.add(car); 
			 
		 }
			
			
			
			close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cars;
	}

	public static void updateCar(int carId, String newName, String newBrand, double newPrice) {
		 try {
		        open();
		        query = "UPDATE car SET name=?, brand=?, price=? WHERE id=?";
		        preparedStatement = connection.prepareStatement(query);
		        preparedStatement.setString(1, newName);
		        preparedStatement.setString(2, newBrand);
		        preparedStatement.setDouble(3, newPrice);
		        preparedStatement.setInt(4, carId);

		        preparedStatement.executeUpdate();

		        close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		
		
	}

	public static void deleteCarRecord(String carId) {
		// TODO Auto-generated method stub
		try {
	        open();
	        query = "DELETE FROM car WHERE id=?";
	        preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, carId);

	        preparedStatement.executeUpdate();

	        close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		
	}

	
	

}
