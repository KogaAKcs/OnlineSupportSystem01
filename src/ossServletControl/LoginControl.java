package ossServletControl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import OSSmainPackage.teacher;

/**
 * Servlet implementation class LoginControl
 */
@WebServlet("/LoginControl")
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControl() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ようころ！");

		try{

			teacher info = new teacher();
			info.deleteDB(Integer.parseInt( request.getParameter("TeacherID") ) );

			/*
			info.setTeacherID(Integer.parseInt(request.getParameter("TeacherID")));
			System.out.println(info.teacherID);
			info.setName(request.getParameter("name"));
			System.out.println(info.getName());
			info.setMailaddress(request.getParameter("mailaddress"));
			System.out.println(info.getMailaddress());
			info.setPassword(request.getParameter("password"));
			System.out.println(info.getPassword());
			info.editDB(info.teacherID);
			request.setAttribute("testData", info);
			getServletContext().getRequestDispatcher("/testResult.jsp").forward(request, response);
			}catch(ServletException e) {
			System.out.println("ServletException");
		}catch(IOException e) {
			System.out.println("IOException");
			*/



		}catch(Exception e) {
			System.out.println("Exception");
		}finally{

		}
	}


}
