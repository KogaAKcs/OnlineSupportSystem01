package OSSmainPackage;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * 科目データ
 *
 * @author s3
 *
 */
public class Category implements Serializable {

	int CategoryID;
	String name;
	int teacherID;

	static String classname  = "Category";

	public Category() {
		this(0, "", 0);
	}

	public Category(int A,String B,int C) {
		this.CategoryID = A;
		this.name = B;
		this.teacherID = C;

		try {
			System.out.println(classname + "thコンストラクタ2");
			//NamingException
			Class.forName("com.mysql.jdbc.Driver");

		}catch(ClassNotFoundException e ) {
			System.out.println(classname + "エラーclassnot：" + e);
		}catch(Exception e) {
			System.out.println(classname + "THエラーコンストラクタ：" + e);
		}
	}


	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int iD) {
		CategoryID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
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
			String sql = "INSERT INTO Category(CategoryID, name, teacherID) VALUES(? ,? ,?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.CategoryID);
			stmt.setString(2, this.name);
			stmt.setInt(3, this.teacherID);
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
	 * @return ArrayList<Category>
	 */
	public static ArrayList<Category> getData(int id){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		ArrayList<Category> list = new ArrayList<Category>();

		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "SELECT * FROM Category WHERE CategoryID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			System.out.println("SQL文は" + stmt.toString());
			rs = stmt.executeQuery();

			rs.next();
			Category th = new Category();
			th.setCategoryID(rs.getInt("CategoryID"));
			th.setName(rs.getString("name"));
			th.setTeacherID(rs.getInt("teacherID"));

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
	 * @return ArrayList<Category>
	 */
	public static ArrayList<Category> getData(int start, int goal){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		ArrayList<Category> list = new ArrayList<Category>();

		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "SELECT * FROM Category WHERE CategoryID BETWEEN ? AND ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, start);
			stmt.setInt(2, goal);
			System.out.println("SQL文は" + stmt.toString());
			rs = stmt.executeQuery();

			while(rs.next()){
				Category th = new Category();
				th.setCategoryID(rs.getInt("CategoryID"));
				th.setName(rs.getString("name"));
				th.setTeacherID(rs.getInt("TeacherID"));

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
			String sql = "UPDATE Category SET CategoryID = ?, name = ?, teacherID = ? "
					+ " WHERE CategoryID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.CategoryID);
			stmt.setString(2, this.name);
			stmt.setInt(3, this.teacherID);
			stmt.setInt(4, id);
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
			String sql = " DELETE FROM Category WHERE CategoryID = ? ";
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
