<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Model(sub) : HelloWorld");
%>
<br>
${ObjectTest}
<br>
<br>
${list}
<br>
<br>
<c:forEach var="mylist" items="${list}">
${mylist} <br>
</c:forEach>

����� �̸��� ${name}�Դϴ�.

<br>
</body>
</html>