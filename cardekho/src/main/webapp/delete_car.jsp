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
        <th colspan="3">ID</th>
     <!-- <th></th>
        <th></th>
        -->
       
    </tr>
    </thead>
    <tbody>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.id}</td>
            
            <td>
                <form action="delete_car" method="post">
                    <input type="text" name="carId" value="${car.id}">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>