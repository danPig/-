<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>高级搜索</title>
  </head>
  
  <body>
    <h3 align="center">高级搜索</h3>
    <form action="/domesticManagement/query.do" method="post">
    	<input type="hidden" name="operate" value="query"/>
    	<table border="0" align="center" width="20%"  style="margin-left: 60px">
    		<tr>
    			<td width="100px">客户名称</td>
    			<td width="40%">
    				<input type="text" name="domesticDomain.stuffname"/>
    			</td>
    		</tr>
    		<tr>
    			<td>客户性别</td>
    			<td>
    				<select name="domesticDomain.sex">
    					<option value="">==请选择性别==</option>
    					<option value="男">男</option>
    					<option value="女">女</option>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td>年龄</td>
    			<td>
    				<input type="text" name="domesticDomain.age"/>
    			</td>
    		</tr>
    		<tr>
    			<td>级别</td>
    			<td>
    				<input type="text" name="domesticDomain.thelevel"/>
    			</td>
    		</tr>
    		<tr>
    			<td></td>
    			<td>
    				<input type="submit" value="查询"/>
    				<input type="reset" value="重置"/>
    			</td>
    		
    		</tr>
    	</table>
    </form>
  </body>
</html>
