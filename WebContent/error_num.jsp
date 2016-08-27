<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312" import="haosnn.save.savedata"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div style="position:absolute; width:100%; height:100%; z-index:-1; left:0; top:0;">      
	<img src="images/gufeng_num_error.jpg" height="100%" width="100%" style="left:0; top:0;">      
	</div>
	<br/><br/><br/>
	<p align="center"><b><font color="red">ÕâÊÇÄúµÄ±êÌâ£º<%=savedata.getdatahead()%></font></b></p>
	<p align="center"><font color="black">ÕâÊÇÄúµÄÕýÎÄ£º<%=savedata.getdatabody()%></font></p><br/>
	<p align="center"><b><font color="black">ÏÂÃæÊÇÕýÈ·µÄÌîÐ´Ê¾·¶£¬ÄúÊäÈëµÄ¸ñÊ½ÓÐÎÊÌâ</font></b></p>
	<p align="center"><b><font color="red">µÇðÙÈ¸Â¥</font></b></p>
	<p align="center"><font color="white">°×ÈÕÒÀÉ½¾¡</font></p>
	<p align="center"><font color="white">»ÆºÓÈëº£Á÷</font></p>
	<p align="center"><font color="white">ÓûÇîÇ§ÀïÄ¿</font></p>
	<p align="center"><font color="white">¸üÉÏÒ»²ãÂ¥</font></p><br/><br/>
	
	<p align="center"><font color="green">ÇëÔÚÖ®Ç°µÄÁ½¸öÎÄ±¾¿òÀïÃæÖ±½ÓÌîÐ´ÎÄ×Ö</font></p>
	<p align="center"><a href="jueju.jsp">ÖØÐÂ×÷Ê«£¨Çë±£´æÄúµÄÎÄ×Ö£©</a></p>
	
</body>
</html>

