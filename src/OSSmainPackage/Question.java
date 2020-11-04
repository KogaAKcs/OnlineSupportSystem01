package OSSmainPackage;

import java.io.Serializable;

public class Question implements Serializable {

	int ID;
	int CategoryID;
	String Question;
	String Picture;
	String Answer1;
	String Answer2;
	String Answer3;
	String Answer4;
	String Correctanswer;


	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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






}
