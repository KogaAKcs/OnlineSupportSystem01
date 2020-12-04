package OSSmainPackage;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 問題＿親データ
 *
 * @author s3
 *
 */
abstract public class Question implements Serializable {

	int QuestionID;
	int CategoryID;
	String Question;
	String Picture;

	/**
	 * 正解
	 */
	String Correctanswer;
	/**
	 * 解説
	 */
	String Commentary;

	int classificationN;

	public Question() {
		this(0,0,"","");
	}

	public Question(int QuestionID, int CategoryID, String Question, String Picture) {
		this.QuestionID = QuestionID;
		this.CategoryID = CategoryID;
		this.Question = Question;
		this.Picture = Picture;
	}

	static String classname  = "Question";


	public int getQuestionID() {
		return QuestionID;
	}
	public void setQuestionID(int iD) {
		QuestionID = iD;
	}
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public int getClassificationN() {
		return classificationN;
	}
	public void setClassificationN(int classificationN) {
		this.classificationN = classificationN;
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

	abstract public void insertDB();
	abstract public ArrayList<Question> getDB();
	abstract public void editDB();
	abstract public void deleteDB();



}
