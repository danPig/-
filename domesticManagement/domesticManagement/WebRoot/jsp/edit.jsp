<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>编辑员工信息</title>
  </head>
  
  <body>
    <h3 align="center">编辑员工</h3>
    <form action="/domesticManagement/update.do" method="post">
    	<input type="hidden" name="domesticDomain.stuffid" value="${domesticDomain.stuffid}"/>
    	<input type="hidden" name="operate" value="update"/>
    	<table border="0" align="center" width="30%" style="margin-left: 100px">
    		<tr>
    			<td>员工姓名</td>
    			<td><input type="text" name="domesticDomain.stuffname" value="${domesticDomain.stuffname}"/></td>
    		</tr>
    		<tr>
    			<td>员工性别</td>
    			<td>
    				<input type="radio" name="domesticDomain.sex" value="男" id="male"<c:if test="${domesticDomain.sex eq '男' }">checked="checked"</c:if>/>
    				<label for="male">男</label>
    				<input type="radio" name="domesticDomain.sex" value="女" id="female"<c:if test="${domesticDomain.sex eq '女' }">checked="checked"</c:if>/>
    				<label for="female">女</label>
    			</td>
    		</tr>
    		<tr>
    			<td>员工年龄</td>
    			<td>
    				<input type="text" name="domesticDomain.age" value="${domesticDomain.age}"/>
    			</td>
    		</tr>
			<tr>
				<td>电话</td>
				<td>
					<input type="text" name="domesticDomain.tel" value="${domesticDomain.tel}" />
				</td>
			</tr> 
			<tr>
				<td>等级</td>
				<td>
					<input type="text" name="domesticDomain.thelevel" value="${domesticDomain.thelevel}"/>
				</td>
			</tr>
			<tr>
				<td>描述</td>
				<td><textarea rows="5" cols="30" name="domesticDomain.descriptions">${domesticDomain.descriptions}</textarea></td>
			</tr>   	
    		<tr>
    			<td></td>
    			<td>
    				<input type="submit" value="更改">
    				<input type="reset" value="重置"/>
    			</td>
    		</tr>
    	</table>
    
    
    
    
    
    </form>
  </body>
</html>
