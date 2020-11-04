package OSSmainPackage;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
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


	DataSource ds;


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
		Connection cn = null;
		PreparedStatement ps = null;
		try {
			cn = ds.getConnection();
			ps = cn.prepareStatement("INSERT INTO schedules(title, schedule_date, schedule_time, memo) VALUES(? ,? ,? ,?)");
			ps.setInt(1, this.teacherID);
		}catch(Exception e) {

		}finally {
			try {
				ps.close();
			}catch(Exception e) {

			}
			try {
				cn.close();
			}catch(Exception e) {

			}
		}
	}

	public static teacher getDB() {

	}

	public static ArrayList<teacher> getAllData(){

	}

}
