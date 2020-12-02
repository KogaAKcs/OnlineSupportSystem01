package ossServletControl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Category_Controller
 */
@WebServlet("/Create_Category_Controller")
public class Create_Category_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create_Category_Controller() {
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
		dummyCategory info = new dummyCategory();
		 info.setCategoryID(Integer.parseInt(request.getParameter("CategoryID")));
		info.setName(request.getParameter("Name"));
		info.setTeacherID(Integer.parseInt(request.getParameter("TeacherID")));

		info.insertDB();
		log(info.getName);
		System.out.println("<html><head></head><body>aaa</body></html>");
	}

}
