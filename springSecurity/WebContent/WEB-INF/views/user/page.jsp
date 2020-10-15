<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/include/header.jspf" %>
</head>
<body>

<br><br>
<div class="container text-center">
	<h1>USER PAGE</h1>
</div>
<br><br>

<div class="container text-center">
	<h6 class="font-italic text-danger">USER 페이지입니다. <br>감사합니다</h6>
</div>
<br><br>

<div class="container text-center">
	<a href='<c:url value="/"/>' class="text-dark"><i class="fas fa-undo"></i></a>
</div>

</body>
</html>