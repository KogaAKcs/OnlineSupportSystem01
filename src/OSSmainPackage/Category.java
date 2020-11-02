package OSSmainPackage;

import java.io.Serializable;

public class Category implements Serializable {

	int ID;
	String name;
	String teacherID;

	public Category(int A,String B,String C) {
		this.ID = A;
		this.name = B;
		this.teacherID = C;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
}
