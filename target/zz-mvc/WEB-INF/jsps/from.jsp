<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="user">
		<label for="username"><input type="text" value="${user.username}" id="username" name="username"/></label>
		<label for="password"><input type="text" value="${user.password }" id="password" name="password"/></label>
		<button>提交</button>
	</form>
</body>
</html>