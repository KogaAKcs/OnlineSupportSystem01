package OSSmainPackage;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * 問題＿四択式データ
 *
 * @author s3
 *
 */
public class Question_choice extends Question implements Serializable{

	String Answer1;
	String Answer2;
	String Answer3;
	String Answer4;
	String Correctanswer;
	String Commentary;

	public Question_choice() {

	}

	public Question_choice(int QuestionID,
							int CategoryID,
							String Question,
							String Picture,
							int classificationN,
							String Answer1,
							String Answer2,
							String Answer3,
							String Answer4,
							String Correctanswer,
							String Commentary) {

		this.QuestionID = QuestionID;

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


	public String getAnswer1() {
		return Answer1;
	}
	public void setAnswer1(String answer1) {
		Answer1 = answer1;
	}
	public String getAnswer2() {
		return Answer2;
	}
	public void setAnswer2(String answer2) {
		Answer2 = answer2;
	}
	public String getAnswer3() {
		return Answer3;
	}
	public void setAnswer3(String answer3) {
		Answer3 = answer3;
	}
	public String getAnswer4() {
		return Answer4;
	}
	public void setAnswer4(String answer4) {
		Answer4 = answer4;
	}
	public String getCorrectanswer() {
		return Correctanswer;
	}
	public void setCorrectanswer(String correctanswer) {
		Correctanswer = correctanswer;
	}
	public String getCommentary() {
		return Commentary;
	}

	public void setCommentary(String commentary) {
		Commentary = commentary;
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
			String sql = "INSERT INTO Question(QuestionID, "
					+ "CategoryID, Question, Picture, classificationN) VALUES(?, ?, ?, ?, ?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.QuestionID);
			stmt.setInt(2, this.CategoryID);
			stmt.setString(3, this.Question);
			stmt.setString(5, this.Picture);
			stmt.setInt(6, this.classificationN);
			stmt.executeUpdate();


			sql = "INSERT INTO Question(QuestionID, "
					+ "Answer1, Answer2, Answer3, Answer4, "
					+ "Correctanswer, Commentary) VALUES(?, ?, ?, ?, ?, ?, ?)";
			stmt.setInt(1, this.QuestionID);
			stmt.setString(2, this.Answer1);
			stmt.setString(3, this.Answer2);
			stmt.setString(4, this.Answer3);
			stmt.setString(5, this.Answer4);
			stmt.setString(6, this.Correctanswer);
			stmt.setString(7, this.Commentary);
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
	public static ArrayList<Question> getData(int id){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs_P = null;
		ResultSet rs_C = null;

		ArrayList<Question> listTH = new ArrayList<Question>();

		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "SELECT * FROM Question WHERE QuestionID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			System.out.println("SQL文は" + stmt.toString());
			rs_P = stmt.executeQuery();

			sql = "SELECT * FROM Question_choice WHERE QuestionID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, rs_P.getInt("QuestionID"));
			System.out.println("SQL文は" + stmt.toString());
			rs_C = stmt.executeQuery();

			rs_P.next();
			Question_choice qu = new Question_choice();
			qu.setQuestionID(rs_P.getInt("QuestionID"));
			qu.setCategoryID(rs_P.getInt("CategoryID"));
			qu.setQuestion(rs_P.getString("Question"));
			qu.setPicture(rs_P.getString("Picture"));
			qu.setClassificationN(rs_P.getInt("ClassificationN"));
			qu.setAnswer1(rs_C.getString("Answer1"));
			qu.setAnswer2(rs_C.getString("Answer2"));
			qu.setAnswer3(rs_C.getString("Answer3"));
			qu.setAnswer4(rs_C.getString("Answer4"));
			qu.setCorrectanswer(rs_C.getString("Correctanswer"));
			qu.setCommentary(rs_C.getString("Commentary"));


			listTH.add(qu);
		}catch(Exception e) {
			System.out.println(classname +  "エラgetData：" + e);
		}finally {
			try {
				rs_P.close();
				rs_C.close();
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println(classname + "エラclose：" + e);
			}
		}
		return listTH;
	}

	/**
	 * DBからデータ取得
	 * @param id 数値
	 * @param start 取得するデータのIDの始点の数値
	 * @param goal 取得するデータのIDの終点の数値
	 * @return ArrayList<teacher>
	 */
	public static ArrayList<Question> getData(int start, int goal){
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs_P = null;
		ResultSet rs_C = null;

		ArrayList<Question> listTH = new ArrayList<Question>();

		try {
			con = DriverManager.getConnection(NAME.DB_NAME, NAME.DB_USER_NAME, NAME.DB_PASS);
			String sql = "SELECT * FROM Question WHERE BETWEEN ? AND ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, start);
			stmt.setInt(2, goal);
			System.out.println("SQL文は" + stmt.toString());
			rs_P = stmt.executeQuery();

			sql = "SELECT * FROM Question_choice WHERE BETWEEN ? AND ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, start);
			stmt.setInt(1, goal);
			System.out.println("SQL文は" + stmt.toString());
			rs_C = stmt.executeQuery();

			while(rs_P.next()) {

				Question_choice qu = new Question_choice();
				qu.setQuestionID(rs_P.getInt("QuestionID"));
				qu.setCategoryID(rs_P.getInt("CategoryID"));
				qu.setQuestion(rs_P.getString("Question"));
				qu.setPicture(rs_P.getString("Picture"));
				qu.setClassificationN(rs_P.getInt("ClassificationN"));
				qu.setAnswer1(rs_C.getString("Answer1"));
				qu.setAnswer2(rs_C.getString("Answer2"));
				qu.setAnswer3(rs_C.getString("Answer3"));
				qu.setAnswer4(rs_C.getString("Answer4"));
				qu.setCorrectanswer(rs_C.getString("Correctanswer"));
				qu.setCommentary(rs_C.getString("Commentary"));


				listTH.add(qu);
			}

		}catch(Exception e) {
			System.out.println(classname +  "エラgetData：" + e);
		}finally {
			try {
				rs_P.close();
				rs_C.close();
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
			String sql = "UPDATE teacher SET teacherID = ?, password = ?, mailaddress = ?, name = ?"
					+ " WHERE teacherID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.teacherID);
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
			String sql = " DELETE FROM teacher WHERE teacherID=? ";
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
