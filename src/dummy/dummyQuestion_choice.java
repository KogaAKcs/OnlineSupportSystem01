package dummy;

import java.io.Serializable;
import java.util.ArrayList;

import OSSmainPackage.Question;
import OSSmainPackage.Question_choice;

public class dummyQuestion_choice extends Question_choice implements Serializable{

	static ArrayList<Question> list;

	public dummyQuestion_choice() {
		super();

		list  = new ArrayList<Question>();
		for(int i=0; i<=5; i++) {
			Question_choice th = new Question_choice();
			list.add(th);
		}
	}

	public void insertDB() {
		System.out.println("挿入成功！" + list.get(1).getQuestionID());

	}

	public static ArrayList<Question> getData(int id) {
		list = (ArrayList<Question>) list.subList(id - 1 , id);
		return list;
	}

	public static ArrayList<Question> getData(int start, int goal) {
		list = (ArrayList<Question>) list.subList(start - 1 , goal);
		return list;
	}

	public void editDB(int id) {
		System.out.println(id + "：の編集成功！");
	}

	public static void deleteDB(int id) {
		System.out.println(id +"：削除成功！");
	}

}
