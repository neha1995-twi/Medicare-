<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>This is One.jsp</h2>
<%
String UserName=request.getParameter("User Name");
%>
<%=
UserName
%>

<%
request.getParameter("User Name");
%>
</body>
</html>