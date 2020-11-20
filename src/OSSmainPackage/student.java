package OSSmainPackage;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 * 生徒データ
 *
 * @author s3
 *
 */
public class student implements Serializable{

	private int studentID;
	private String password;
	private String mailaddress;
	private String name;

	static String classname  = "student";


	public student() {
		this(0, "", "", "");
	}

	public student(int A, String B, String C, String D) {
		this.studentID = A;
		this.password = B;
		this.mailaddress = C;
		this.name = D;

		try {
			System.out.println(classname + "コンストラクタ2");
			//NamingException
			Class.forName("com.mysql.jdbc.Driver");

		}catch(ClassNotFoundException e ) {
			System.out.println(classname + "エラーclassnot：" + e);
		}catch(Exception e) {
			System.out.println(classname + "エラーコンストラクタ：" + e);
		}
	}



	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
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



	/**
	 * DBにデータ登録
	 * @return void
	 */
	public void insertDB(){
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "INSERT INTO teacher(studentID, password, mailaddress, name) VALUES(? ,? ,? ,?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.studentID);
			stmt.setString(2, this.password);
			stmt.setString(3, this.mailaddress);
			stmt.setString(4, this.name);
			stmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(classname + "エラinsert：" + e);
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println(classname + "エラclose：" + e);
			}
		}
	}


	/**
	 * DBからデータ取得
	 * @param id 数値
	 * @return ArrayList<teacher>
	 */
	public static ArrayList<student> getData(int id){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		ArrayList<student> list = new ArrayList<student>();

		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "SELECT * FROM student WHERE studentID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			System.out.println("SQL文は" + stmt.toString());
			rs = stmt.executeQuery();

			rs.next();
			student th = new student();
			th.setStudentID(rs.getInt("studentID"));
			th.setPassword(rs.getString("password"));
			th.setMailaddress(rs.getString("mailaddress"));
			th.setName(rs.getString("name"));

			list.add(th);
		}catch(Exception e) {
			System.out.println(classname +  "エラgetData：" + e);
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println(classname + "エラclose：" + e);
			}
		}
		return list;
	}

	/**
	 * DBからデータ取得
	 * @param id 数値
	 * @param start 取得するデータのIDの始点の数値
	 * @param goal 取得するデータのIDの終点の数値
	 * @return ArrayList<teacher>
	 */
	public static ArrayList<student> getData(int start, int goal){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		ArrayList<student> list = new ArrayList<student>();

		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "SELECT * FROM student WHERE studentID BETWEEN ? AND ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, start);
			stmt.setInt(2, goal);
			System.out.println("SQL文は" + stmt.toString());
			rs = stmt.executeQuery();

			while(rs.next()){
				student th = new student();
				th.setStudentID(rs.getInt("studentID"));
				th.setPassword(rs.getString("password"));
				th.setMailaddress(rs.getString("mailaddress"));
				th.setName(rs.getString("name"));

				list.add(th);
			}
		}catch(Exception e) {
			System.out.println(classname + "エラgetData：" + e);
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println(classname + "エラclose：" + e);
			}
		}
		return list;

	}

	/**
	 * DBのデータ編集
	 * @param id 編集するデータのID
	 * @return void
	 */
	public void editDB(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "UPDATE student SET studentID = ?, password = ?, mailaddress = ?, name = ?"
					+ " WHERE studentID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.studentID);
			stmt.setString(2, this.password);
			stmt.setString(3, this.mailaddress);
			stmt.setString(4, this.name);
			stmt.setInt(5, id);
			stmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(classname + "エラinsert：" + e);
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println(classname + "エラclose：" + e);
			}
		}
	}

	/**
	 * DBのデータ削除
	 * @param id 削除するデータのID
	 * @return void
	 */
	public static void deleteDB(int id) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = " DELETE FROM student WHERE studentID=? ";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(classname + "エラinsert：" + e);
		}finally {
			try {
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println(classname + "エラclose：" + e);
			}
		}
	}


}


