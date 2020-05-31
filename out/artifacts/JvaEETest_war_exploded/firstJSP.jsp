<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: vaceslavfilippov
  Date: 24.05.2020
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1 align="center">Testing JSP</h1>
    <%
        String name = request.getParameter("name");
        String surName = request.getParameter("surname");
    %>
    <p align="center">
        <%="<h1 align=\"center\">Hello, " + name + " " + surName + "!</h1>"%>
    </p>
</body>
</html>
