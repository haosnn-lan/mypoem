<%@ page language="java" pageEncoding="gb2312"%>
<html>
<head>
	<title>近体诗登陆</title>
</head>
<body bgcolor="#E3E3E3">

<div style="position:absolute; width:100%; height:100%; z-index:-1; left:0; top:0;">      
<img src="images/gufeng1.jpg" height="100%" width="100%" style="left:0; top:0;">    
</div>
<br/><br/><br/>
<h2 align="center">账号或密码错误请重新输入</h2>
<br/><br/><br/>
<form action="validate.jsp" method="post" style="text-align:center">
账号:<input type="text" name="username" size="21"/><br/><br/><br/>
密码:<input type="password" name="password" size="21"/><br/><br/><br/>
<input type="submit" value="登录" />
<input type="reset" value="重置"/>
</form>
</body>
</html>