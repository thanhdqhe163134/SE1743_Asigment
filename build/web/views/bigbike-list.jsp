<%-- 
    Document   : bigbike-list
    Created on : Jun 21, 2023, 11:51:28 PM
    Author     : faced
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Big Bike List</title>
</head>
<body>
    <h1>Big Bike List</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Brand</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Pictures</th>
        </tr>
        <% for (BigBike bigBike : (List<BigBike>) request.getAttribute("bigBikes")) { %>
        <tr>
            <td><%= bigBike.getId() %></td>
            <td><%= bigBike.getBrand() %></td>
            <td><%= bigBike.getName() %></td>
            <td><%= bigBike.getDescription() %></td>
            <td><%= bigBike.getPrice() %></td>
            <td><%= bigBike.getPictures() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>

