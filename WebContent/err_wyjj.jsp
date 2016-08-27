<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312" import="haosnn.save.savedata"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body background="images/grey.jpg">
<p><b>你的五言绝句平仄或者韵律上有问题,你可以根据下面的规则改进您的“近体诗”</b></p>
<p>下面是五言绝句的基本平仄押韵规则  x代表可平可仄</p>

<p><b><font color="red">五言绝句规则1：x仄平平仄，平平x仄平。x平平仄仄，x仄仄平平。二四句末尾字押韵</font></b></p>
<p><b><font color="red">五言绝句规则2：x仄仄平平，平平x仄平。x平平仄仄，x仄仄平平。一二四句末尾字押韵</font></b></p>
<p><b><font color="red">五言绝句规则3：x平平仄仄，x仄仄平平。x仄平平仄，平平x仄平。二四句末尾押韵</font></b></p>
<p><b><font color="red">五言绝句规则4：平平x仄平，x仄仄平平。x仄平平仄，平平x仄平。一二四句末尾押韵</font></b></p><br/><br/>

<p align="center"><b><font color="black">这是您的标题：<%=savedata.getdatahead()%></font></b></p>
<p align="center"><b><font color="red">这是您的正文：<%=savedata.getdatabody()%></font></b></p><br/>

<p align="center"><a href="jueju.jsp">重新作诗（请保存您的文字）</a></p>
</body>
</html>

