package dummy;

import java.io.Serializable;
import java.util.ArrayList;

import OSSmainPackage.student;

public class dummyStudent extends student implements Serializable{

	static ArrayList<student> list;

	public dummyStudent() {
		super();

		list  = new ArrayList<student>();
		for(int i=0; i<=5; i++) {
			student th = new student( i, "pass" + i, "mail" + i, "name" +i );
			list.add(th);
		}
	}

	@Override
	public void insertDB() {
		System.out.println("挿入成功！");
	}

	public static ArrayList<student> getData(int id) {
		list = (ArrayList<student>) list.subList(id - 1 , id);
		return list;
	}

	public static ArrayList<student> getData(int start, int goal) {
		list = (ArrayList<student>) list.subList(start - 1 , goal);
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
