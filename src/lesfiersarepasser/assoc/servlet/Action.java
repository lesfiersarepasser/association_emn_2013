package lesfiersarepasser.assoc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lesfiersarepasser.assoc.bdd.DerbyConnection;
import lesfiersarepasser.assoc.bean.Utilisateur;

/**
 * Servlet implementation class Action
 */
public class Action extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("login") != null) {
			Utilisateur user = DerbyConnection.connectUser(request.getParameter("logID"), request.getParameter("logPW"));
			if(user!=null) {
				request.setAttribute("login", user.getIdentifiant());
			}
		}
		if (request.getParameter("register") != null) {
			
		}
	}

}
