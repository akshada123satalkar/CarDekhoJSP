<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Car Details</h2>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Brand</th>
        <th>Price</th>
        <th>Details</th>
    </tr>
    </thead>
    <tbody>
    
        <tr>
            <td>${car.id}</td>
            <td>${car.name}</td>
            <td>${car.brand}</td>
            <td>${car.price}</td>
            <td>
                <form action="update_car" method="post">
                    <input type="text" name="carId" value="${car.id}">
                    <input type="text" name="newName" placeholder="New Name">
                    <input type="text" name="newBrand" placeholder="New Brand">
                    <input type="text" name="newPrice" placeholder="New Price">
                    <button type="submit">Update</button>
                </form>
            </td>
        </tr>
  
    </tbody>
</table>

</body>
</html>