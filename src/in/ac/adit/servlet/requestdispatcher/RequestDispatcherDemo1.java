package in.ac.adit.servlet.requestdispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcherDemo1
 */
public class RequestDispatcherDemo1 extends HttpServlet {
	RequestDispatcher requestDispatcher = null;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("ATTRIBUTE1", "VALUE1");
		request.setAttribute("ATTRIBUTE2", "VALUE2");
		request.setAttribute("ATTRIBUTE3", "VALUE3");
		requestDispatcher = request.getRequestDispatcher("RequestDispatcherDemo2");
		requestDispatcher.forward(request, response);	
	}
}
