<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
 <form action="add_car" method="post" style="max-width: 400px; margin: 0 auto;border="1px solid"">
 
     <table  style="border-collapse: collapse; width: 100%;">
           <tr>
           <td  style="padding: 10px;">Id</td>
           <td  style="padding: 10px;"><input type="text" name="id"></td>
           </tr>
            <tr>
           <td  style="padding: 10px;">Name</td>
           <td  style="padding: 10px;"><input type="text" name="name"></td>
           </tr>
            <tr>
           <td  style="padding: 10px;">Brand</td>
           <td  style="padding: 10px;"><input type="text" name="brand"></td>
           </tr>
           
            <tr>
           <td  style="padding: 10px;">Price</td>
           <td  style="padding: 10px;"><input type="text" name="price"></td>
           </tr>
           
           
     </table>
     <input type="submit" value="ADD"  style="margin-top: 10px; padding: 8px 15px; background-color: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer;">
 
 </form>
</div>
   <diV align="center">
        <%! String message; %>
    <% 
    message=(String)request.getAttribute("message");%>
    <%
    if(message!=null){
    	request.getAttribute("message");%>
    	 <h1><%=message %></h1>
  <%} %>  
   
   
  
  
   
</diV>    

</body>
</html>