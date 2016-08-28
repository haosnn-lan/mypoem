<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312" import="haosnn.save.savedata"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div style="position:absolute; width:100%; height:100%; z-index:-1; left:0; top:0;">      
	<img src="images/gufeng_success.jpg" height="100%" width="100%" style="left:0; top:0;">      
	</div>
	<p align="center"><b><font color="red" size="30"><%=savedata.getbt()%></font></b></p>
	<p align="center"><font color="blue" size="20"><%=savedata.getls(0)%> | <%=savedata.getls(1)%></font></p><br/>
	<p align="center"><font color="blue" size="20"><%=savedata.getls(2)%> | <%=savedata.getls(3)%></font></p><br/>
	<p align="center"><font color="blue" size="20"><%=savedata.getls(4)%> | <%=savedata.getls(5)%></font></p><br/>
	<p align="center"><font color="blue" size="20"><%=savedata.getls(6)%> | <%=savedata.getls(7)%></font></p><br/>
	<p align="center"><a href="jueju.jsp">·µ»Ø£¨Çë±£´æÄúµÄÂÉÊ«£©</a></p>
	
</body>
</html>