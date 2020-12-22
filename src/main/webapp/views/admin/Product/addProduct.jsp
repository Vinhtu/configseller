<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="main-content">
		<div class="section__content section__content--p30">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<div class="card">
							<div class="card-header">
								<strong>Product</strong> Informations
							</div>
							<div class="card-body card-block">
								<form action="product?action=addProduct" method="Post" 
									 class="form-horizontal">

									<div class="row form-group">
										<div class="col col-md-3">
											<label for="text-input" class=" form-control-label">Product
												Name</label>
										</div>
										<div class="col-12 col-md-9">
											<input type="text" id="text-input" name="productName"
												placeholder="Name" class="form-control" />
										</div>
									</div>
									<div class="row form-group">
										<div class="col col-md-3">
											<label for="email-input" class=" form-control-label">Price</label>
										</div>
										<div class="col-12 col-md-9">
											<input type="text" id="email-input" name="productPrice"
												placeholder="Price" class="form-control" />
										</div>
									</div>
									<div class="row form-group">
										<div class="col col-md-3">
											<label for="textarea-input" class=" form-control-label">Description</label>
										</div>
										<div class="col-12 col-md-9">
											<textarea rows="9" id="textarea-input"
												name="productDescription" placeholder="Content..."
												class="form-control"></textarea>
										</div>
									</div>
									<div class="card-footer">

										<button type="submit" class="fa fa-dot-circle-o">
											Add
										</button>
										<a href="<c:url value="/admin/product?view=index"/>"
											type="reset" class="btn btn-danger btn-sm"> <i
											class="fa fa-ban"></i> Return
										</a>
									</div>
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