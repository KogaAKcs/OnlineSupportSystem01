package OSSmainPackage;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * 問題＿記述データ
 *
 * @author s3
 *
 */
public class Question_nunber extends Question implements Serializable{

	int Number;

	public Question_nunber() {

	}

	public Question_nunber(int QuestionID,
							int CategoryID,
							String Question,
							String Picture,
							int classificationN,
							int Number,
							String Correctanswer,
							String Commentary) {

		this.QuestionID = QuestionID;
		this.CategoryID = CategoryID;
		this.Question = Question;
		this.Picture = Picture;
		this.classificationN =  classificationN;
		this.Number = Number;
		this.Correctanswer = Correctanswer;
		this.Commentary =  Commentary;

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


	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
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
					+ " text, Correctanswer, Commentary) VALUES(?, ?, ?, ?, ?, ?, ?)";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.QuestionID);
			stmt.setInt(2, this.Number);
			stmt.setString(3, this.Correctanswer);
			stmt.setString(4, this.Commentary);
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
			Question_nunber qu = new Question_nunber();
			qu.setQuestionID(rs_P.getInt("QuestionID"));
			qu.setCategoryID(rs_P.getInt("CategoryID"));
			qu.setQuestion(rs_P.getString("Question"));
			qu.setPicture(rs_P.getString("Picture"));
			qu.setClassificationN(rs_P.getInt("ClassificationN"));
			qu.setNumber(rs_C.getInt("Number"));
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

				Question_nunber qu = new Question_nunber();
				qu.setQuestionID(rs_P.getInt("QuestionID"));
				qu.setCategoryID(rs_P.getInt("CategoryID"));
				qu.setQuestion(rs_P.getString("Question"));
				qu.setPicture(rs_P.getString("Picture"));
				qu.setClassificationN(rs_P.getInt("ClassificationN"));
				qu.setNumber(rs_C.getInt("text"));
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
			String sql = "UPDATE Question SET QuestionID = ?, CategoryID = ?, Question = ?, Picture = ?, classificationN = ?"
					+ " WHERE QuestionID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.QuestionID);
			stmt.setInt(2, this.CategoryID);
			stmt.setString(3, this.Question);
			stmt.setString(5, this.Picture);
			stmt.setInt(6, this.classificationN);
			stmt.setInt(7, this.QuestionID);
			stmt.executeUpdate();


			sql = "UPDATE Question SET QuestionID = ?, Answer1 = ?, Answer2 = ?, Answer3 = ?, Answer4 = ?, Correctanswer = ?, Commentary = ?"
					+ " WHERE QuestionID = ?";
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, this.QuestionID);
			stmt.setInt(2, this.getNumber());
			stmt.setString(3, this.Correctanswer);
			stmt.setString(4, this.Commentary);
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
			String sql = " DELETE FROM Question WHERE QuestionID=? ";
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

