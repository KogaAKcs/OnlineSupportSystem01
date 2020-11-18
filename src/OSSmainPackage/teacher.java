package OSSmainPackage;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.sql.DataSource;

public class teacher implements Serializable {

	int teacherID;
	String password;
	String mailaddress;
	String name;


	static DataSource ds;

	Connection con;
	String dbDirectory;
	String dbname;
	String pass;
	String sql;
	PreparedStatement stmt;
	ResultSet rs;



	public teacher() {

	}

	public teacher(int A,String B,String C,String D) throws NamingException, ClassNotFoundException {
		this.teacherID = A;
		this.password = B;
		this.mailaddress = C;
		this.name = D;

		Class.forName("com.mysql.cj.jdbc.Driver");
		dbDirectory = "jdbc:mysql://localhost:3306/osstest01?serverTimezone=JST";
		dbname = "root";
		pass = "kcsf";

		/*
		Context context = new InitialContext();
		ds = (DataSource)context.lookup("jdbc:mysql://localhost:3306/test_db?serverTimezone=JST", "root", "kcsf");
		*/

	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailaddress() {
		return mailaddress;
	}

	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void insertDB(){
		try {
			con = DriverManager.getConnection(dbDirectory, dbname, pass);
			sql = "INSERT INTO teacher(teacherID, password, mailaddress, name) VALUES(? ,? ,? ,?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.teacherID);
			stmt.setString(2, this.password);
			stmt.setString(3, this.mailaddress);
			stmt.setString(4, this.name);
		}catch(Exception e) {
			System.out.println("エラin：" + e);
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println("エラcl：" + e);
			}
		}

		/*
		Connection dcn = null;
		PreparedStatement ps = null;
		try {
			dcn = ds.getConnection();
			ps = dcn.prepareStatement("INSERT INTO teacher(teacherID, password, mailaddress, name) VALUES(? ,? ,? ,?)");
			ps.setInt(1, this.teacherID);
			ps.setString(2, this.password);
			ps.setString(3, this.mailaddress);
			ps.setString(4, this.name);
		}catch(Exception e) {

		}finally {
			try {
				ps.close();
			}catch(Exception e) {

			}
			try {
				dcn.close();
			}catch(Exception e) {

			}
		}
		*/
	}


	public static ArrayList<teacher> getData(int id){
		Connection dcn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			dcn = ds.getConnection();
			ps = dcn.prepareStatement("SELECT * FROM teacher WHERE id = ?");
			ps.setInt(1, id);
		}catch(Exception e) {

		}finally {

		}
		return null;
	}

	public static ArrayList<teacher> getData(int start, int goal){
		Connection dcn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			dcn = ds.getConnection();
			ps = dcn.prepareStatement("SELECT * FROM teacher WHERE id BETWEEN ? AND ?");
			ps.setInt(1, start);
			ps.setInt(2, goal);
		}catch(Exception e) {

		}finally {

		}
		return null;

	}

	public void editDB() {
		Connection dcn = null;
		PreparedStatement ps = null;
		try {
			dcn = ds.getConnection();
			ps = dcn.prepareStatement("UPDATE teacher SET schedules(title, schedule_date, schedule_time, memo) VALUES(? ,? ,? ,?)");
			ps.setInt(1, teacherID);
			ps.setString(2, password);
			ps.setString(3, mailaddress);
			ps.setString(4, name);
		}catch(Exception e) {

		}finally {
			try {
				ps.close();
			}catch(Exception e) {

			}
			try {
				dcn.close();
			}catch(Exception e) {

			}
		}
	}

	public static void deleteDB(int id) {
		Connection dcn = null;
		PreparedStatement ps = null;
		try {
			dcn = ds.getConnection();
			ps = dcn.prepareStatement("DELETE FROM teacher WHERE id=?");
			ps.setInt(1, id);
		}catch(Exception e) {

		}finally {
			try {
				ps.close();
				dcn.close();
			}catch(RuntimeException e) {

			}catch(Exception e) {

			}
		}
	}

}
