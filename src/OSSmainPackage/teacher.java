package OSSmainPackage;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class teacher implements Serializable {

	int teacherID;
	String password;
	String mailaddress;
	String name;


	static DataSource ds;


	public teacher() {

	}

	public teacher(int A,String B,String C,String D) throws NamingException {
		this.teacherID = A;
		this.password = B;
		this.mailaddress = C;
		this.name = D;

		Context context = new InitialContext();
		ds = (DataSource)context.lookup("java:comp/env/jdbc/Jsp10");
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



	public void insertDB() {
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
			}catch(Exception e) {

			}catch(Exception e) {

			}
		}
	}

}
