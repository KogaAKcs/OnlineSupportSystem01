package OSSmainPackage;

import java.io.Serializable;

public class classroom implements Serializable {
	int ID;
	String teacherID;
	public classroom(int A,String B) {
		this.ID = A;
		this.teacherID = B;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
}
