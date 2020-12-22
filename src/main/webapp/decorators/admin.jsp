<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags-->
<meta charset="UTF-8">

<!-- Title Page-->
<title><decorator:title default="admin"></decorator:title></title>

<link href="<c:url value="/assets/admin/css/font-face.css"/>"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/assets/admin/vendor/font-awesome-4.7/css/font-awesome.min.css" />"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/assets/admin/vendor/font-awesome-5/css/fontawesome-all.min.css"/>"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/assets/admin/vendor/mdi-font/css/material-design-iconic-font.min.css"/>"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link
	href="<c:url value="/assets/admin/vendor/bootstrap-4.1/bootstrap.min.css"/>"
	rel="stylesheet" media="all">

<!-- Vendor CSS-->
<link
	href="<c:url value="/assets/admin/vendor/animsition/animsition.min.css"/>"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/assets/admin/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" />"
	rel="stylesheet" media="all">
<link href="<c:url value="/assets/admin/vendor/wow/animate.css" />"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/assets/admin/vendor/css-hamburgers/hamburgers.min.css"/>"
	rel="stylesheet" media="all">
<link href="<c:url value="/assets/admin/vendor/slick/slick.css" />"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/assets/admin/vendor/select2/select2.min.css"/>"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/assets/admin/vendor/perfect-scrollbar/perfect-scrollbar.css"/>"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="<c:url value="/assets/admin/css/theme.css" />"
	rel="stylesheet" media="all">

</head>
<body class="animsition" style="animation-duration: 900ms; opacity: 1;">
 	<div class="page-wrapper">
			<!-- MENU SIDEBAR-->
		<%@include file="./admin/navigation.jsp"%>
		<!-- END MENU SIDEBAR-->
		<!-- PAGE CONTAINER-->
		<div class="page-container">
			<!-- HEADER DESKTOP-->
			<%@include file="./admin/header.jsp"%>
			<!-- HEADER DESKTOP-->
			<!-- MAIN CONTENT-->
			<decorator:body />
			<!-- END MAIN CONTENT-->
			<!-- END PAGE CONTAINER-->
		</div>
	</div>


	<!-- Jquery JS-->
	<script src="<c:url value="/assets/admin/vendor/jquery-3.2.1.min.js" />"></script>
	<!-- Bootstrap JS-->
	<script
		src="<c:url value="/assets/admin/vendor/bootstrap-4.1/popper.min.js"/>"></script>
	<script
		src="<c:url value="/assets/admin/vendor/bootstrap-4.1/bootstrap.min.js"/>"></script>
	<!-- Vendor JS       -->
	<script src="<c:url value="/assets/admin/vendor/slick/slick.min.js"/>">
		
	</script>
	<script src="<c:url value="/assets/admin/vendor/wow/wow.min.js"/>"></script>
	<script
		src="<c:url value="/assets/admin/vendor/animsition/animsition.min.js"/>"></script>
	<script
		src="<c:url value="/assets/admin/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js"/>">
		
	</script>
	<script
		src="<c:url value="/assets/admin/vendor/counter-up/jquery.waypoints.min.js"/>"></script>
	<script
		src="<c:url value="/assets/admin/vendor/counter-up/jquery.counterup.min.js"/>">
		
	</script>
	<script
		src="<c:url value="/assets/admin/vendor/circle-progress/circle-progress.min.js"/>"></script>
	<script
		src="<c:url value="/assets/admin/vendor/perfect-scrollbar/perfect-scrollbar.js"/>"></script>
	<script
		src="<c:url value="/assets/admin/vendor/chartjs/Chart.bundle.min.js"/>"></script>
	<script
		src="<c:url value="/assets/admin/vendor/select2/select2.min.js"/>">
		
	</script>

	<!-- Main JS-->
    <script src="<c:url value="/assets/admin/js/main.js"/>" ></script>

</body>

</html>
<!-- end document-->



