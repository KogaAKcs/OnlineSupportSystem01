package ossServletControl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import OSSmainPackage.Question;
import dummy.dummyQuestion;

/**
 * Servlet implementation class Create_Question_Controller_Sele
 */
@WebServlet("/Create_Question_Controller_Sele")
public class Create_Question_Controller_Sele extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create_Question_Controller_Sele() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Question info = new dummyQuestion();
		info.setCategoryID(Integer.parseInt(request.getParameter("categoryID")));
		info.setQuestion(request.getParameter("question"));

		info.setAnswer1(request.getParameter("answer1"));
		info.setAnswer2(request.getParameter("answer2"));
		info.setAnswer3(request.getParameter("answer3"));
		info.setAnswer4(request.getParameter("answer4"));
		info.setCorrectanswer(request.getParameter("correctanswer"));

		info.insertDB();
		log(info.CategoryID + info.Question + info.Picture + info.Answer1 + info.Answer2 + info.Answer3 + info.Answer4 + info.Correctanswer);
		System.out.println("<html><head></head><body>aaa</body></html>");



	}
}
