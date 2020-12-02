package dummy;

import java.io.Serializable;
import java.util.ArrayList;

import OSSmainPackage.Question;

public class dummyQuestion extends Question implements Serializable{

	static ArrayList<Question> list;

	public dummyQuestion() {
		super();

		list  = new ArrayList<Question>();
		for(int i=0; i<=5; i++) {
			Question th = new Question( i, 000, "Question" + i, "Picture" + i , "Answer1" + i , "Answer2" + i , "Answer3" + i , "Answer4" +
					i , "Correctanswer" );
			list.add(th);
		}
	}

	public void insertDB() {
		System.out.println("挿入成功！" + CategoryID + Question + Answer1 + Answer2 + Answer3 + Answer4 + Correctanswer);

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
