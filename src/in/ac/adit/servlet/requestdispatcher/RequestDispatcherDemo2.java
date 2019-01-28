package in.ac.adit.servlet.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcherDemo2
 */
public class RequestDispatcherDemo2 extends HttpServlet {
	RequestDispatcher requestDispatcher = null;
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		requestDispatcher = request.getRequestDispatcher("requestDispatcherDemo.jsp");
		requestDispatcher.include(request, response);
		
		out.println(request.getAttribute("ATTRIBUTE1"));
		out.println(request.getAttribute("ATTRIBUTE2"));
		out.println(request.getAttribute("ATTRIBUTE3"));
		
	}
}
