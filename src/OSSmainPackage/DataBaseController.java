package OSSmainPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

/**
 * Servlet implementation class DataBaseController
 */
@WebServlet("/DataBaseController")
public class DataBaseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataBaseController() {
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
		//Ç¢ÇÈÅHdoGet(request, response);
		
		try {
			request.setCharacterEncoding("UTF-8");
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/Jsp10");
			Connection db = ds.getConnection();
			PreparedStatement ps = db.prepareStatement("INSERT INTO schedules(title, schedule_date, schedule_time, memo) VALUES(? ,? ,? ,?)");
			ps.setString(1, request.getParameter("title"));
			ps.setString(2, request.getParameter("date_year") + "-" +
				request.getParameter("date_month") + "-" +
				request.getParameter("date_day"));
			ps.setString(3, request.getParameter("time_hour") + ":" +
				request.getParameter("time_minute"));
			ps.setString(4, request.getParameter("memo"));
			ps.executeUpdate();
			ps.close();
			db.close();
			response.sendRedirect("new.jsp");
		}catch(Exception e) {
			
		}
	}

}
