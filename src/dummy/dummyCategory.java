package dummy;

import java.io.Serializable;
import java.util.ArrayList;

import OSSmainPackage.Category;

public class dummyCategory extends Category implements Serializable{

	static ArrayList<Category> list;

	public dummyCategory() {
		super();

		list  = new ArrayList<Category>();
		for(int i=0; i<=5; i++) {
			Category th = new Category(i, "name" + i, 000 );
			list.add(th);
		}

	}

	@Override
	public void insertDB() {
		System.out.println("挿入成功！");
	}

	public static ArrayList<Category> getData(int id) {
		list = (ArrayList<Category>) list.subList(id - 1 , id);
		return list;
	}

	public static ArrayList<Category> getData(int start, int goal) {
		list = (ArrayList<Category>) list.subList(start - 1 , goal);
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
