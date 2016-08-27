package haosnn.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import jintishimanage.wuyanjueju;
import jintishimanage.qiyanjueju;
import haosnn.save.savedata;
public class MainServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		request.setCharacterEncoding("gb2312");
		StringBuffer bodybuf=new StringBuffer();
		String head=request.getParameter("head");
		String body=request.getParameter("body");
		savedata.setdatahead(head);
		savedata.setdatabody(body);
		System.out.println("data:");
		for(int i=0;i<body.length();i++){
			if(body.charAt(i)>31&&body.charAt(i)!=127){
				bodybuf.append(body.charAt(i));
			}
			System.out.println(body.charAt(i));
		}
		String newbody=bodybuf.toString();
		System.out.println("data:");
		System.out.println(head.length());
		System.out.println(head);
		System.out.println(newbody.length());
		System.out.println(newbody);
		
		
		if(newbody.length()==20||newbody.length()==28){
			savedata.setbt(head);
			if(newbody.length()==20){
				if(wuyanjueju.judge_wyjj(newbody)){
					response.sendRedirect("success.jsp");
					savedata.setinfo(newbody);
				}
				else
					response.sendRedirect("error.html");
			}
			else{
				if(qiyanjueju.judge_qyjj(newbody)){
					response.sendRedirect("success.html");
				}
				else
					response.sendRedirect("error.html");
			}
		}
		
		
		else if(newbody.length()==40||newbody.length()==56){
			
		}
		else
			response.sendRedirect("error.html");	
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doGet(request,response);
	}
}
