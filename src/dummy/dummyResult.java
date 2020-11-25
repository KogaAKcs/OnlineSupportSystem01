package dummy;

import java.io.Serializable;
import java.util.ArrayList;

import OSSmainPackage.Result;

public class dummyResult extends Result implements Serializable{

	static ArrayList<Result> list;

	public dummyResult() {
		super();

		list  = new ArrayList<Result>();
		for(int i=0; i<=5; i++) {
			Result th = new Result( i, i * 10 , "L" + i, "Tw" +i, "Th" +i );
			list.add(th);
		}
	}

	@Override
	public void insertDB() {
		System.out.println("挿入成功！");
	}

	public static ArrayList<Result> getData(int id) {
		list = (ArrayList<Result>) list.subList(id - 1 , id);
		return list;
	}

	public static ArrayList<Result> getData(int start, int goal) {
		list = (ArrayList<Result>) list.subList(start - 1 , goal);
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
