package OSSmainPackage;

public class dummyteacher extends teacher {
	
	public dummyteacher() {
		super();
	}
	
	@Override
	public void insertDB() {
		System.out.println("データベースインサート:"
				+ this.teacherID
				+ this.password
				+ this.mailaddress
				+ this.name);
	}

}
