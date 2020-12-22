<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Info</title>
</head>
<body>
	<div class="main-content">
		<div class="section__content section__content--p30">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<div class="card">
							<div class="card-header">
								<strong>Product DETAILS</strong>
							</div>
							<div class="card-body card-block">
								<form
									action="product?action=editProduct&productID=${product.id}"
									method="post" class="form-horizontal">
									<div class="row form-group">
										<div class="col col-md-3">
											<label class=" form-control-label">ProductID</label>
										</div>
										<div class="col-12 col-md-9">
											<p class="form-control-static">${product.id}</p>
										</div>
									</div>
									<div class="row form-group">
										<div class="col col-md-3">
											<label for="text-input" class=" form-control-label">Product
												Name</label>
										</div>
										<div class="col-12 col-md-9">
											<input type="text" id="text-input" name="productName"
												class="form-control" value="${product.name}" />
										</div>
									</div>
									<div class="row form-group">
										<div class="col col-md-3">
											<label for="email-input" class=" form-control-label">Price</label>
										</div>
										<div class="col-12 col-md-9">
											<input type="text" id="text-input" name="productPrice"
												class="form-control" value="${product.price}">
										</div>
									</div>
									<div class="row form-group">
										<div class="col col-md-3">
											<label for="textarea-input" class=" form-control-label">Description</label>
										</div>
										<div class="col-12 col-md-9">
											<textarea name="productDescription" id="textarea-input"
												rows="9" class="form-control">${product.description}</textarea>
										</div>
									</div>
									<div class="row form-group">
										<div class="col col-md-3">
											<label for="select" class=" form-control-label">PromotionID</label>
										</div>
										<div class="col-12 col-md-9">
											<select name="productPromotion" id="select"
												class="form-control">
												<c:forEach items="${promotionList}" var="promotion">
													<option value="${promotion.id }"
														<c:if test="${product.promotion_id==promotion.id}">
															selected
														</c:if>>
														${promotion.percent}%</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="row form-group">
										<div class="col col-md-3">
											<label for="select" class=" form-control-label">CategoryID</label>
										</div>
										<div class="col-12 col-md-9">
											<select name="productCategory" id="select"
												class="form-control">
												<c:forEach items="${categoryList}" var="category">
													<option value="${category.name }"
														<c:if test="${category.id==product.category_id}">selected</c:if>>
													</option>
												</c:forEach>												
											</select>
										</div>
									</div>
									<button type="submit" class="btn btn-primary btn-sm">
										<i class="fa fa-dot-circle-o"></i> Edit
									</button>
									<a href="<c:url value="/admin/product?view=index"/>"
										type="reset" class="btn btn-danger btn-sm"> <i
										class="fa fa-ban"></i> Return
									</a>
								</form>
							</div>

						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>