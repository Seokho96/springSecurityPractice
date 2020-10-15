<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>    
    
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
		<h1>Security Project</h1>
		<sec:authorize access="isAnonymous()">
		<h5>
			<a href='<c:url value="/secu/loginPage"/>' class="badge badge-pill badge-info">
				LOGIN
			</a>
			로그인해 주세요
		</h5>		
		</sec:authorize>	
	</div>
	<br><br>
	<div class="container text-center col-2">
		<a href='<c:url value="/page"/>' role="button" class="btn btn-outline-secondary btn-block">GUEST</a>
		<a href='<c:url value="/user/page"/>' role="button" class="btn btn-outline-secondary btn-block">USER</a>
		<a href='<c:url value="/member/page"/>' role="button" class="btn btn-outline-secondary btn-block">MEMBER</a>
		<a href='<c:url value="/admin/page"/>' role="button" class="btn btn-outline-secondary btn-block">ADMIN</a>
	</div>





</body>
</html>







