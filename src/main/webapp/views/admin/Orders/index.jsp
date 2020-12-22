<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orders</title>
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
											<th>productId</th>
											<th>customerId</th>
											<th>create_date</th>
											<th>finish_date</th>
											<th></th>
										</tr>
									</thead>
									<tbody>

										<tr class="tr-shadow">
											<td></td>
											<td><span class="block-email"></span></td>
											<td><span class="role admin">admin</span></td>
											<td class="desc">Samsung S8 Black</td>
											<td>2018-09-27 02:12</td>
											<td><span class="status--process">Processed</span></td>
											<td>$679.00</td>

										</tr>
										<tr class="spacer"></tr>
										<c:if test="${orderList!=null }">
											<c:forEach items="${orderList}" var="order">
												<tr class="tr-shadow">
													<td><c:out value="${order.productId}" /></td>
													<td><span class="block-email"><c:out
																value="${order.customerId}" /></span></td>
													<td><span class="role admin">admin</span></td>
													<td>
														<div class="table-data-feature">
															<button class="item" data-toggle="tooltip"
																data-placement="top" title="Send">
																<i class="zmdi zmdi-mail-send"></i>
															</button>
															<button class="item" data-toggle="tooltip"
																data-placement="top" title="Delete">
																<i class="zmdi zmdi-delete"></i>
															</button>
														</div>
													</td>
												<tr class="spacer"></tr>
												</tr>
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