package OSSmainPackage;
import java.io.Serializable;

public class Result implements Serializable {

	int StudentID;
	int QuestionID;
	String LastTime;
	String TwoTimesBefore;
	String ThreeTimesBefore;


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
}
