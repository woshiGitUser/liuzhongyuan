<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>修改页面</title>

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
	<form action="updateGoods" method="post">
		<table>
			<tr>
				<td>商品编号</td>
				<td><input name="id" value="${goodsList.id }"/></td>
			</tr>
			<tr>
				<td>订单状态</td>
				<td><select name="status"><option>请选择</option>
					<option value="0">待处理</option>
					<option value="1">处理中</option>
					<option value="2">已处理</option>
				</select></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input name="price" value="${goodsList.price }"/></td>
			</tr>
			<tr>
				<td>库存数量</td>
				<td><input name="counts" value="${goodsList.counts }" /></td>
			</tr>
			<tr>
				<td>商品名称</td>
				<td><input name="goodsName" value="${goodsList.goodsName}"/></td>
			</tr>
			
			<tr><td><button type="submit">提交</button><button>返回</button></td></tr>
		</table>
	</form>
</body>
</html>
