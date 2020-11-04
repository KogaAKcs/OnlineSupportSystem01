package OSSmainPackage;

import java.io.Serializable;



public class student implements Serializable{

	private int studentID;
	private String password;
	private String mailaddress;

	public student(int A, String B, String C) {
		this.studentID = A;
		this.password = B;
		this.mailaddress = C;
	}



	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
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
}


