package OSSmainPackage;

public class dummyteacher extends teacher {
	
	public dummyteacher() {
		super();
	}
	
	@Override
	public void insertDB() {
		System.out.println("�f�[�^�x�[�X�C���T�[�g:"
				+ this.teacherID
				+ this.password
				+ this.mailaddress
				+ this.name);
	}

}
