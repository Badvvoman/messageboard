<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin-left: 35%; margin-top: 100px; font-family: Microsoft YaHei">
		<h1>网络论坛登录界面</h1>
		<form action="LoginServlet" method="post">
			<div class="form-group">
				<label for="name">User Name</label>
				<input type="text" class="form-control" id="name" name="name" placeholder="User Name" autocomplete="off">
			</div>
			<div class="form-group">
				<label for="pass">Password</label>
				<input type="password" class="form-control" id="pass" name="password" placeholder="Password" autocomplete="off">
				
			</div>
			<input type="submit"  value="登录" style="font-size: 32px"> 
			&nbsp;&nbsp;<a href="register.jsp">注册</a>
			<a href="adminlogin.jsp">管理员登陆</a>
		</form>
	</div>
</body>

</html>