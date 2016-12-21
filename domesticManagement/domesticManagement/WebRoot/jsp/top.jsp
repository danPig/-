<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base target="main">
    <title>top.jsp</title>

  </head>
  
  <body style="text-align: center;">
    <h1>员工关系管理系统</h1>
    <a href="<c:url value='/jsp/add.jsp'/>">添加客户</a>
    <a href="<c:url value='/list.do?operate=list'/>">查询客户</a>
    <a href="<c:url value='/jsp/superQuery.jsp'/>">高级搜索</a>
  </body>
</html>
