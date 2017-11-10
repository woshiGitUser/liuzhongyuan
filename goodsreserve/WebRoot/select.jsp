<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'select.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form action="">
	<table>
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>库存数量</td>
			<td>订单状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${goodsList }" var="goods">
			<tr>
				<td>${goods.id }</td>
				<td>${goods.goodsName }</td>
				<td>${goods.price}</td>
				<td>${goods.counts}</td>
				<td><c:if test="${goods.status==0 }">待处理</c:if>
					<c:if test="${goods.status==1 }">处理中</c:if>
					<c:if test="${goods.status==2}">已处理</c:if>
				</td>
				
				<td><a href='selectById?id=${goods.id}'>修改</a></td>
			</tr>
		</c:forEach>
		</table>
	</form>
</body>
</html>
