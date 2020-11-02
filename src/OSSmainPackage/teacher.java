package OSSmainPackage;

import java.io.Serializable;

public class teacher implements Serializable {

	int teacherID;
	String password;
	String mailaddress;
	String name;

	public teacher(int A,String B,String C,String D) {
		this.teacherID = A;
		this.password = B;
		this.mailaddress = C;
		this.name = D;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailaddress() {
		return mailaddress;
	}

	public void setMailaddress(String mailaddress) {
		this.mailaddress = mailaddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
