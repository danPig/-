<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>查询列表</title>
 

  </head>
  
  <body>
    <h3 align="center">员工列表</h3>
    <table  border="1" width="70%" align="center">
    	<tr>
    		<th>员工姓名</th>
    		<th>性别</th>
    		<th>年龄</th>
    		<th>电话</th>
    		<th>级别</th>
    		<th>描述</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${list}" var="item">
    	<tr>
    		<td>${item.stuffname}</td>
    		<td>${item.sex}</td>
    		<td>${item.age}</td>
    		<td>${item.tel}</td>
    		<td>${item.thelevel}</td>
    		<td>${item.descriptions}</td>
    		<td>
                <a href="<c:url value='/edit.do?operate=edit&id=${item.stuffid}'/> ">编辑</a>
                <a href="<c:url value='/delete.do?operate=delete&id=${item.stuffid}'/> ">删除</a>
    		</td>
    	</tr>
    	</c:forEach>
    
    
    </table>
  </body>
</html>
