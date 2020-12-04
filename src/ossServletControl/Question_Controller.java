package ossServletControl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import OSSmainPackage.Category;
import OSSmainPackage.Question;

/**
 * Servlet implementation class Question_Controller
 */
@WebServlet("/Question_Controller")
public class Question_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Question_Controller() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Question> list =  Question.getDB( new Category().setCategoryID( Integer.parseInt( request.getParameter("") ) ) );

		HttpSession session = request.getSession(true);//セッションがある場合は？
		session.setAttribute("quList", list);
		session.setAttribute("nowQ", list.get(0));

		getServletContext().getRequestDispatcher("/test01/Anser_view.jsp").forward(request, response);

	}

}
