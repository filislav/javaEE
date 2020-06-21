<%--
  Created by IntelliJ IDEA.
  User: vaceslavfilippov
  Date: 07.06.2020
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
    <%@ page import="somePackage.Cart" %>
    <% Cart cart = (Cart)session.getAttribute("cart"); %>
    <p>Наименование корзины <%=cart.getName() %></p>
    <p>Количество<%=cart.getQuantity() %></p>

</body>
</html>
