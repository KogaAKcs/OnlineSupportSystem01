package OSSmainPackage;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

public class teacher implements Serializable {

	int teacherID;
	String password;
	String mailaddress;
	String name;


	static DataSource ds;

	Connection con;
	String dburl;
	String usr;
	String pass;
	String sql;
	PreparedStatement stmt;
	ResultSet rs;



	public teacher() {

		try {
			System.out.println("コンストラクタ");
			//NamingException
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			dburl = "jdbc:mysql://localhost:3366/osstest01";
			//osstest01?characterEncoding=UTF-8?serverTimezone=JST
			usr = "root";
			pass = "kcsf";

		}catch(ClassNotFoundException e ) {
			System.out.println("エラclassnot：" + e);
		}catch(Exception e) {
			System.out.println("エラconstructor：" + e);
		}



	}

	public teacher(int A,String B,String C,String D) {
		this.teacherID = A;
		this.password = B;
		this.mailaddress = C;
		this.name = D;

		try {
			System.out.println("コンストラクタ");
			//NamingException
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			dburl = "jdbc:mysql://localhost:3366/osstest01";
			//osstest01?characterEncoding=UTF-8?serverTimezone=JST
			usr = "root";
			pass = "kcsf";

		}catch(ClassNotFoundException e ) {
			System.out.println("エラclassnot：" + e);
		}catch(Exception e) {
			System.out.println("エラconstructor：" + e);
		}

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
			con = DriverManager.getConnection(dburl, usr, pass);
			sql = "INSERT INTO teacher(teacherID, password, mailaddress, name) VALUES(? ,? ,? ,?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.teacherID);
			stmt.setString(2, this.password);
			stmt.setString(3, this.mailaddress);
			stmt.setString(4, this.name);
			stmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("エラinsert：" + e);
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println("エラclose：" + e);
			}
		}
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

	public void editDB(int id) {
		try {
			con = DriverManager.getConnection(dburl, usr, pass);
			sql = "UPDATE teacher SET schedules(title, schedule_date, schedule_time, memo) VALUES(? ,? ,? ,?)"
					+ "WHERE id = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.teacherID);
			stmt.setString(2, this.password);
			stmt.setString(3, this.mailaddress);
			stmt.setString(4, this.name);
			stmt.setInt(5, id);
			stmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("エラinsert：" + e);
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println("エラclose：" + e);
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
