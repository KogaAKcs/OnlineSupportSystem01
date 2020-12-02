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

@WebServlet("/HomeControl")

/*
 * HttpServletを継承したQuestion_Viewクラスを作成
 * HttpServletの継承は大前提
 */

public class  HomeControl extends HttpServlet{

@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
		try {
			switch((String)request.getParameterNames().nextElement()) {
				case "Classroom":
					getServletContext().getRequestDispatcher("/Classroom.jsp").forward(request, response);
					break;

				case"Sucedule":
					getServletContext().getRequestDispatcher("/Sucedule.jsp").forward(request, response);
					break;

				case"Category":
					try {
						dummyCategory ca = new dummyCategory();

						ArrayList<Category> clist = dummyCategory.getData(1);
						System.out.println( clist.size() );
						request.setAttribute("listData", clist);
						getServletContext().getRequestDispatcher("/Category.jsp").forward(request, response);
						}

					catch(Exception e) {
						System.out.println("Exc01" + e);
					}
					break;

				case"Result":
					getServletContext().getRequestDispatcher("/Result.jsp").forward(request, response);
					break;

				case"Notice":
					getServletContext().getRequestDispatcher("/Notice.jsp").forward(request, response);
					break;

				case"Logout":
					getServletContext().getRequestDispatcher("/Logout.jsp").forward(request, response);
					break;



			}
		}catch(Exception e) {
			System.out.println("Exc02" + e);

		}
	}

}
