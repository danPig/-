<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加客户</title>
  </head>
  
  <body>
    <h3 align="center">添加客户</h3>
    <form action="/domesticManagement/add.do" method="post">
    	<input type="hidden" name="operate" value="add"/>
    	<table border="0" align="center" width="30%" style="margin-left: 100px">
    		<tr>
    			<td width="100px">员工姓名</td>
    			<td width="40%">
    				<input type="text" name="domesticDomain.stuffname"/>
    			</td>
    		</tr>
    		<tr>
    			<td>员工性别</td>
    			<td>
    				<input type="radio" name="domesticDomain.sex" value="男" id="male"/>
    				<label for="male">男</label>
    				<input type="radio" name="domesticDomain.sex" value="女" id="female"/>
    				<label for="female">女</label>
    			</td>
    		</tr>
    		<tr>
    			<td>员工年龄</td>
    			<td>
    				<input type="text" name="domesticDomain.age"/>
    			</td>
    		</tr>
			<tr>
				<td>电话</td>
				<td>
					<input type="text" name="domesticDomain.tel"/>
				</td>
			</tr>
			<tr>
				<td>级别</td>
				<td>
					<input type="text" name="domesticDomain.thelevel"/>
				</td>
			</tr>
			<tr>
				<td>描述</td>
				<td>
					<textarea rows="5" cols="30" name="domesticDomain.descriptions"></textarea>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="添加员工"/>
					<input type="reset" value="重置"/>
				</td>
			
			</tr>    	
    	</table>
    
    
    </form>
  </body>
</html>
