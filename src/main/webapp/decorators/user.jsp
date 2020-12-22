<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title><decorator:title default="user"></decorator:title></title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

 <link href="<c:url value="/assets/user/css/bootstrap.min.css"/>" rel="stylesheet" media="all">
<link href="<c:url value="/assets/user/css/font-awesome.min.css"/>" rel="stylesheet" media="all">
<link href="<c:url value="/assets/user/css/prettyPhoto.css"/>" rel="stylesheet" media="all" >
<link href="<c:url value="/assets/user/css/price-range.css"/>" rel="stylesheet" media="all" >
<link href="<c:url value="/assets/user/css/animate.css"/>" rel="stylesheet" media="all">
<link href="<c:url value="/assets/user/css/main.css"/>" rel="stylesheet" media="all">
<link href="<c:url value="/assets/user/css/responsive.css"/>" rel="stylesheet" media="all">

<link rel="shortcut icon" href="<c:url value="/assets/user/images/ico/favicon.ico"/>" media="all">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="<c:url value="/assets/user/images/ico/apple-touch-icon-144-precomposed.png"/>" media="all">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="<c:url value="/assets/user/images/ico/apple-touch-icon-114-precomposed.png"/>" media="all">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="<c:url value="/assets/user/images/ico/apple-touch-icon-72-precomposed.png"/>" media="all">
<link rel="apple-touch-icon-precomposed"
	href="<c:url value="/assets/user/images/ico/apple-touch-icon-57-precomposed.png"/>" media="all"> 
</head>
<body>

	<%@include file="./user/header.jsp"%>
		<decorator:body />
	<%@include file="./user/footer.jsp"%>

	  <script src="<c:url value="/assets/user/js/jquery.js"/>"></script>
	<script src="<c:url value="/assets/user/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/jquery.scrollUp.min.js"/>"></script>
	<script src="<c:url value="/assets/user/js/price-range.js"/>"></script>
	<script src="<c:url value="/assets/user/js/jquery.prettyPhoto.js"/>"></script>
	<script src="<c:url value="/assets/user/js/main.js"/>"></script>
</body>


</html>