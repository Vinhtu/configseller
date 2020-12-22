<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<aside class="menu-sidebar d-none d-lg-block">
		<div class="logo">
			<a href="#"> <img
				src="<c:url value="/assets/admin/images/icon/logo.png"/>"
				alt="Cool Admin" />
			</a>
		</div>
		<div class="menu-sidebar__content js-scrollbar1">
			<nav class="navbar-sidebar">
				<ul class="list-unstyled navbar__list">
					<li class="active has-sub">
					<a
						href="<c:url value="/admin"/>"> <i
							class="fas fa-tachometer-alt"></i>Dashboard
					</a>
					<li><a href="<c:url value="/admin/product?view=index"/>"> <i
							class="fas fa-chart-bar"></i>Product
					</a></li>
					<li><a href="<c:url value="/admin/promotion?view=index"/>"> <i
							class="fas fa-table"></i>Promotion
					</a></li>
					<li><a href="<c:url value="/admin/user?view=index"/>"> <i
							class="far fa-check-square"></i>Account
					</a></li>
					<li><a href="<c:url value="/admin/orders?action=index"/>"> <i
							class="far fa-check-square"></i>Orders
					</a></li>

					<li class="has-sub"><a class="js-arrow open" href="#"> <i
							class="fas fa-copy"></i>Pages
					</a>
						
				</ul>
			</nav>
		</div>
	</aside>
</body>
</html>