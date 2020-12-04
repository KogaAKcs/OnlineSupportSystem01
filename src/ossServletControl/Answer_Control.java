package ossServletControl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Answer_Control
 */
@WebServlet("/Answer_Control")
public class Answer_Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Answer_Control() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		switch((String)request.getParameterNames().nextElement()) {

			case "①" :
				//questionビューに書く
				break;

			case "③" :
				request.getParameter("選択したボタン");
				request.setAttribute("questionData", clist);
				request.getSession().setAttribute("", value);
				getServletContext().getRequestDispatcher("/Answer_View2.1.jsp").forward(request, response);
				break;

			case "⑥" :
				getServletContext().getRequestDispatcher("/Answer_View2.jsp").forward(request, response);
				break;




		}


	}

}
