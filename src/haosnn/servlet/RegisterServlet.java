package haosnn.servlet;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

import haosnn.jdbc.MySqlConn;
import haosnn.model.*;

public class RegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("gb2312");
		System.out.println("in it");
		String usr=request.getParameter("username");		//��ȡ�ύע����û���
		String pwd=request.getParameter("password");		//��ȡ�ύע�������
		System.out.println(usr);
		System.out.println(pwd);
		//�����ݿ��в������û���������
		PreparedStatement pstmt=null;
		MySqlConn mysql=new MySqlConn();
		Connection ms=mysql.getConn();
		try{
			pstmt=ms.prepareStatement("insert into usertable values(null,?,?)");
			
			pstmt.setString(1, usr);
			pstmt.setString(2, pwd);
			pstmt.executeUpdate();
			response.sendRedirect("login.jsp");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request,response);
	}
}
