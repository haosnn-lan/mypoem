<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>绝句</title>
</head>
<body>
<div style="position:absolute; width:100%; height:100%; z-index:-1; left:0; top:0;">      
<img src="images/gufeng2_1.jpg" height="100%" width="100%" style="left:0; top:0;">      
</div>
<h2>写下你的绝句，作一首自己的诗</h2>
<p><b><font color="red">在这里你可以写下一首五言或者七言绝句</font></b></p>
<p><b><font color="red">系统将根据基本的平仄与韵律规则（不包含拗救等特殊规则）</font></b></p>
<p><b><font color="red">为你判断绝句的正误</font></b></p>
<p><b><font color="red">两个输入框分别是标题与正文</font></b></p>
<p><b><font color="red">只能输入汉字</font></b></p>
<form action="MainServlet" method="post" style="text-align:center">
	<input type="text" name="head" size="30"/><br/><br/>
	<textarea name="body" rows="6" cols="30"></textarea><br/><br/>
<input type="submit" value="提交"/>
<input type="reset" value="清空"/>
</form>
</body>
</html>