package dummy;

import java.io.Serializable;
import java.util.ArrayList;

import OSSmainPackage.teacher;

public class dummyTeacher extends teacher implements Serializable{

	static ArrayList<teacher> list;

	public dummyTeacher() {
		super();

		list  = new ArrayList<teacher>();
		for(int i=0; i<=5; i++) {
			teacher th = new teacher( i, "pass" + i, "mail" + i, "name" +i );
			list.add(th);
		}
	}

	@Override
	public void insertDB() {
		System.out.println("挿入成功！");
	}

	public static ArrayList<teacher> getData(int id) {
		list = (ArrayList<teacher>) list.subList(id - 1 , id);
		return list;
	}

	public static ArrayList<teacher> getData(int start, int goal) {
		list = (ArrayList<teacher>) list.subList(start - 1 , goal);
		return list;
	}

	@Override
	public void editDB(int id) {
		System.out.println(id + "：の編集成功！");
	}

	public static void deleteDB(int id) {
		System.out.println(id +"：削除成功！");
	}

}
