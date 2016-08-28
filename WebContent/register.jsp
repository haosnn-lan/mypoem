<%@ page language="java" pageEncoding="gb2312"%>
<html>
<head>
	<title>注册用户</title>
</head>
<body >
<div style="position:absolute; width:100%; height:100%; z-index:-1; left:0; top:0;">      
<img src="images/gufeng1.jpg" height="100%" width="100%" style="left:0; top:0;">    
</div>
<br/><br/><br/><br/>
	<form action="RegisterServlet" method="post" style="text-align:center">
	<p><b><font color="red">用户注册(注册成功自动返回)</font></b></p>
	账号:<input type="text" name="username"/><br/><br/>
	密码:<input type="password" name="password"/><br/><br/>
		<input type="submit" value="注册"/>
		<input type="reset" value="重置"/>
	</form>
</body>
</html>
