package OSSmainPackage;

import java.io.Serializable;

/**
 * 問題＿親データ
 *
 * @author s3
 *
 */
public class Question implements Serializable {

	int QuestionID;
	int CategoryID;
	String Question;
	String Picture;

	int classificationID;

	static String classname  = "Question";


	public int getQuestionID() {
		return QuestionID;
	}
	public void setID(int iD) {
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

}
