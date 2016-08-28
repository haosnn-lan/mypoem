package haosnn.jdbc;
import java.sql.*;
public class MySqlConn {
	private Statement stmt;
	private Connection conn;
	ResultSet rs;
	public MySqlConn(){
		stmt=null;
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			String driver="com.mysql.jdbc.Driver";
			String username = System.getenv("ACCESSKEY");
			String password = System.getenv("SECRETKEY");
			String dbUrl = String.format("jdbc:mysql://%s:%s/%s", System.getenv("MYSQL_HOST"), System.getenv("MYSQL_PORT"), System.getenv("MYSQL_DB"));
			Class.forName(driver).newInstance();
		    conn = DriverManager.getConnection(dbUrl, username, password);
			//conn=DriverManager.getConnection("jdbc:mysql://MYSQL_HOST:MYSQL_PORT/jintishi","ACCESSKEY","SECRETKEY");
			//conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jintishi","root","123456");
		}catch(Exception e){
			e.printStackTrace();
		}
		rs=null;
	}
	public ResultSet executeQuery(String sql){
		try{
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=stmt.executeQuery(sql);
		}catch(SQLException e){
			System.err.println("Data.executeQuery:"+e.getMessage());
		}
		return rs;
	}
	public Connection getConn(){
		return this.conn;
	}
	public void closeStmt(){
		try{
			stmt.close();
		}catch(SQLException e){
			System.err.println("Data.executeQuery:"+e.getMessage());
		}
	}
	public void closeConn(){
		try{
			conn.close();
		}catch(SQLException e){
			System.err.println("Data.executeQuery:"+e.getMessage());
		}
	}
}
