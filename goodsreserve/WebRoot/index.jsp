<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  		<form action="selectByStatus" method="get">
    	<p>请选择区域</p><select name="district"><option value="">请选择</option>
    		<option value="0">海淀</option>
    		<option value="1">朝阳</option>
    		<option value="2">丰台</option>
    		<option value="3">宣武</option>
    		<option value="4">昌平</option>
    	</select>
    	<button id="chaxun" type="submit">查询</button>
    	
    	</form>
    	
    	
  </body>
</html>
