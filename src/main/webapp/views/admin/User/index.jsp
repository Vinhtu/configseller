<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Title Page-->
<title>Account</title>
</head>
<body>
	<div class="main-content">
		<div class="section__content section__content--p30">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12">
						<!-- DATA TABLE -->
						<div class="nooverfl">
							<h3 class="title-5 m-b-35">${account.userName}</h3>
							<div class="table-data__tool">
								<div class="table-data__tool-left">
									<div class="rs-select2--light rs-select2--md">
										<select class="js-select2" name="property">
											<option selected="selected">All Properties</option>
											<option value="">Option 1</option>
											<option value="">Option 2</option>
										</select>
										<div class="dropDownSelect2"></div>
									</div>
									<div class="rs-select2--light rs-select2--sm">
										<select class="js-select2" name="time">
											<option selected="selected">Today</option>
											<option value="">3 Days</option>
											<option value="">1 Week</option>
										</select>
										<div class="dropDownSelect2"></div>
									</div>
									<button class="au-btn-filter">
										<i class="zmdi zmdi-filter-list"></i>filters
									</button>
								</div>
								<div class="table-data__tool-right">
									<button class="au-btn au-btn-icon au-btn--green au-btn--small">
										<i class="zmdi zmdi-plus"></i>add item
									</button>
									<div class="rs-select2--dark rs-select2--sm rs-select2--dark2">
										<select class="js-select2" name="type">
											<option selected="selected">Export</option>
											<option value="">Option 1</option>
											<option value="">Option 2</option>
										</select>
										<div class="dropDownSelect2"></div>
									</div>
								</div>
							</div>
							<div class="table-responsive table-responsive-data2">
								<table class="table table-data2">
									<thead>
										<tr>
											<th>name</th>
											<th>email</th>
											<th>role</th>
											<th>description</th>
											<th>date</th>
											<th>status</th>
											<th>price</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										<c:if test="${allAccount!=null}">
											<c:forEach items="${allAccount}" var="account">
												<tr class="tr-shadow">
													<td><c:out value="${account.userName }" /></td>
													<td><c:out value="${account.password }" /></td>
													<td><span class="role admin">admin</span></td>
												</tr>
												<tr class="spacer"></tr>
											</c:forEach>
										</c:if>										
										
									</tbody>
								</table>
							</div>
							<div class="user-data__footer">
								<button class="au-btn au-btn-load">load more</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>