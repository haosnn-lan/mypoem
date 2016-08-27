package haosnn.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import jintishimanage.wuyanjueju;
import jintishimanage.wuyanlvshi;
import jintishimanage.qiyanjueju;
import jintishimanage.qiyanlvshi;
import haosnn.save.savedata;
public class MainServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		request.setCharacterEncoding("gb2312");
		StringBuffer bodybuf=new StringBuffer();
		String head=request.getParameter("head");
		String body=request.getParameter("body");
		if(head.length()>0)
			savedata.setdatahead(head);
		else
			savedata.setdatahead("无题");
		
		if(body.length()<=0)
			savedata.setdatabody("");
		
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
		
		//绝句
		if(newbody.length()==20||newbody.length()==28){
			if(head.length()>0)
				savedata.setbt(head);
			else
				savedata.setbt("无题");
			if(newbody.length()==20){
				if(wuyanjueju.judge_wyjj(newbody)){
					response.sendRedirect("success_jj.jsp");
					savedata.setinfo_jj(newbody);
				}
				else
					response.sendRedirect("err_wyjj.jsp");
			}
			else{
				if(qiyanjueju.judge_qyjj(newbody)){
					response.sendRedirect("success_jj.jsp");
					savedata.setinfo_jj(newbody);
				}
				else
					response.sendRedirect("err_qyjj.jsp");
			}
		}
		
		//律诗
		else if(newbody.length()==40||newbody.length()==56){
			if(head.length()>0)
				savedata.setbt(head);
			else
				savedata.setbt("无题");
			if(newbody.length()==40){
				if(wuyanlvshi.judge_wyls(newbody)){
					response.sendRedirect("success_ls.jsp");
					savedata.setinfo_ls(newbody);
				}
				else
					response.sendRedirect("err_wyls.jsp");
			}
			else{
				if(qiyanlvshi.judge_qyls(newbody)){
					response.sendRedirect("success_ls.jsp");
					savedata.setinfo_ls(newbody);
				}
				else
					response.sendRedirect("err_qyls.jsp");
			}
		}
		else
			response.sendRedirect("error_num.jsp");	
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doGet(request,response);
	}
}
