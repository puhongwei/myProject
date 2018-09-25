<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=request.getContextPath() %>/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<tr><td>标识</td><td>用户名</td><td>用户密码</td><td>操作</td></tr>
    <c:forEach items="${userList }" var="user">
	<tr><td>${user.id }</td><td>${user.userName }</td><td>${user.userPass }</td>
	<td>
		<a href="user/showUser.do?id=${user.id }">修改</a>|
		<a href="user/userDel.do?id=${user.id }">删除</a>
	
	</td>
	
	
	</tr>
	</c:forEach>
</table>


</body>
</html>