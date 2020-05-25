<%--
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
    <p>
        <%@ page import="java.util.Date,logic.TestClass" %><!--директива позволяет задавать действия контейнеру-->
        <%= new Date() %>
    <p align="center" ><%=new TestClass().getInfo()%> </p>

    </p>
</body>
</html>
