package OSSmainPackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		System.out.println("<html><head></head><body>エラー</body></html>");

		try{

			teacher info = new teacher();
			info.setTeacherID(Integer.parseInt(request.getParameter("teacherID")));
			info.setName(request.getParameter("name"));
			info.setMailaddress(request.getParameter("mailaddress"));
			info.setPassword(request.getParameter("password"));
			info.insertDB();
			request.setAttribute("testData", info);
			getServletContext().getRequestDispatcher("/testResult.jsp").forward(request, response);
			//log(info.teacherID + info.name + info.mailaddress + info.password);
			//System.out.println("<html><head></head><body>aaa</body></html>");

		}catch(ServletException e) {
			System.out.println("<html><head></head><body>エラー</body></html>");
		}catch(IOException e) {
			System.out.println("<html><head></head><body>エラー</body></html>");
		}catch(Exception e) {
			System.out.println("<html><head></head><body>エラー</body></html>");
		}finally{

		}
	}

}
