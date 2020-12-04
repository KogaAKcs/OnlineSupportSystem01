package OSSmainPackage;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * 成績データ
 *
 * @author s3
 *
 */
public class Result implements Serializable {

	int StudentID;
	int QuestionID;
	String LastTime;
	Date lastdata;
	String TwoTimesBefore;
	Date TwoTimesBeforedata;
	String ThreeTimesBefore;
	Date ThreeTimesBeforedata;

	static String classname  = "Result";

	public Result() {
		this(0, 0, "", "", "");
	}

	public Result(int StudentID, int QuestionID,String LastTime, String TwoTimesBefore, String ThreeTimesBefore) {
		this.StudentID = StudentID;
		this.QuestionID = QuestionID;
		this.LastTime = TwoTimesBefore;
		this.TwoTimesBefore = TwoTimesBefore;
		this.ThreeTimesBefore = ThreeTimesBefore;


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
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public int getQuestionID() {
		return QuestionID;
	}
	public void setQuestionID(int questionID) {
		QuestionID = questionID;
	}
	public String getLastTime() {
		return LastTime;
	}
	public void setLastTime(String lastTime) {
		LastTime = lastTime;
	}
	public String getTwoTimesBefore() {
		return TwoTimesBefore;
	}
	public void setTwoTimesBefore(String twoTimesBefore) {
		TwoTimesBefore = twoTimesBefore;
	}
	public String getThreeTimesBefore() {
		return ThreeTimesBefore;
	}
	public void setThreeTimesBefore(String threeTimesBefore) {
		ThreeTimesBefore = threeTimesBefore;
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
			String sql = "INSERT INTO Result(StudentID, QuestionID, LastTime, TwoTimesBefore, ThreeTimesBefore) VALUES(?, ?, ?, ?, ?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.StudentID);
			stmt.setInt(2, this.QuestionID);
			stmt.setString(3, this.LastTime);
			stmt.setString(4, this.TwoTimesBefore);
			stmt.setString(5, this.ThreeTimesBefore);
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
	public static ArrayList<Result> getData(int id){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		ArrayList<Result> list = new ArrayList<Result>();

		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "SELECT * FROM Result WHERE StudentID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			System.out.println("SQL文は" + stmt.toString());
			rs = stmt.executeQuery();

			rs.next();
			Result th = new Result();
			th.setStudentID(rs.getInt("StudentID"));
			th.setQuestionID(rs.getInt("QuestionID"));
			th.setLastTime(rs.getString("LastTime"));
			th.setTwoTimesBefore(rs.getString("TwoTimesBefore"));
			th.setThreeTimesBefore(rs.getString("ThreeTimesBefore"));

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
	public static ArrayList<Result> getData(int start, int goal){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		ArrayList<Result> listTH = new ArrayList<Result>();

		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "SELECT * FROM Result WHERE StudentID BETWEEN ? AND ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, start);
			stmt.setInt(2, goal);
			System.out.println("SQL文は" + stmt.toString());
			rs = stmt.executeQuery();

			while(rs.next()){
				Result th = new Result();
				th.setStudentID(rs.getInt("StudentID"));
				th.setQuestionID(rs.getInt("QuestionID"));
				th.setLastTime(rs.getString("LastTime"));
				th.setTwoTimesBefore(rs.getString("TwoTimesBefore"));
				th.setThreeTimesBefore(rs.getString("ThreeTimesBefore"));

				listTH.add(th);
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
		return listTH;

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
			String sql = "UPDATE Result SET StudentID = ?, QuestionID = ?, LastTime = ?, "
					+ "TwoTimesBefore = ?, ThreeTimesBefore = ?"
					+ " WHERE teacherID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.StudentID);
			stmt.setInt(2, this.QuestionID);
			stmt.setString(3, this.LastTime);
			stmt.setString(4, this.TwoTimesBefore);
			stmt.setString(5, this.ThreeTimesBefore);
			stmt.setInt(6, id);
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
			String sql = " DELETE FROM Result WHERE StudentID=? ";
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
