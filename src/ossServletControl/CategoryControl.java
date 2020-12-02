package ossServletControl;

/*
 * インポート文
 */

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import OSSmainPackage.Category;
import dummy.dummyCategory;





/*
 * サーブレットクラスの定義
 */

/*
 * サーブレットの呼び出しURLの定義
 * ＠～の記述のやつがアノテーション
 */

@WebServlet("/CategoryControl")

/*
 * HttpServletを継承したQuestion_Viewクラスを作成
 * HttpServletの継承は大前提
 */

public class  CategoryControl extends HttpServlet{

@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
		try {

						dummyCategory ca = new dummyCategory();

						ArrayList<Category> clist = dummyCategory.getData(1);
						System.out.println( clist.size() );
						request.setAttribute("listData", clist);
						getServletContext().getRequestDispatcher("/Question.jsp").forward(request, response);
			}
		catch(Exception e) {
			System.out.println("Exc01" + e);

		}
	}

}
