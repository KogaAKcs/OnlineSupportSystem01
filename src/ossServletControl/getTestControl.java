package ossServletControl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import OSSmainPackage.teacher;

/**
 * Servlet implementation class getTestControl
 */
@WebServlet("/getTestControl")
public class getTestControl extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//teacher th = new teacher();
		ArrayList<teacher> list = teacher.getData( Integer.parseInt( request.getParameter("TeacherID") ) ,
				Integer.parseInt( request.getParameter("name") ));
		System.out.println(list.size());
		request.setAttribute("listData", list);
		getServletContext().getRequestDispatcher("/test01/testResult.jsp").forward(request, response);
	}

}
