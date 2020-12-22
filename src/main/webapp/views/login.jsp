<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->

<!-- Title Page-->
<title>Login</title>

<!-- Fontfaces CSS-->


</head>
 <%  
     String resultLogin = (String)request.getAttribute("result");
    if(resultLogin == null){
    	resultLogin = "";
    }
  %>
<body class="animsition">
	<div class="page-wrapper">
		<div class="page-content--bge5">
			<div class="container">
				<div class="login-wrap">
					<div class="login-content">
						<div class="login-logo">
							<a href="#"> <img src="images/icon/logo.png" alt="CoolAdmin">
							</a>
						</div>
						<div class="login-form">
							<form <c:url value="/login?action=login"  />" method="post" name="login">
								<div class="form-group">
									<label>Account</label> <input class="au-input au-input--full" value="admin"
										type="text" name="username" placeholder="Username">
								</div>
								<div class="form-group">
									<label>Password</label> <input class="au-input au-input--full"
										type="password" value="123456" name="password" placeholder="Password">
								</div>
								<div class="login-checkbox">
									<label> <input type="checkbox" name="remember">Remember
										Me
									</label> <label> <a href="#">Forgotten Password?</a>
									</label>
								</div>
								<c:if test="${not empty message}" >
					                  <div>
											      <!--   <p class="text-success" style="color: #28a745">.text-success</p> -->
											        <p class="text-danger" style="color: #dc3545"><c:out value = "${message}"/> </p>
										 </div>
							      </c:if>
								   <div>
								      <!--   <p class="text-success" style="color: #28a745">.text-success</p> -->
								        <p class="text-danger" style="color: #dc3545">${message} </p>
								   </div>
								<button class="au-btn au-btn--block au-btn--green m-b-20"
									type="submit">sign in</button>
							</form>
							<div class="register-link">
								<p>
									Don't you have account? <a href="#">Sign Up Here</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>



</body>

</html>
<!-- end document-->