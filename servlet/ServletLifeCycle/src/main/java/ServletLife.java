

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet { // 1st step
	static {
		System.out.println("Servlet is Loaded");
	}
	
	public ServletLife() {                        // 2nd step
		System.out.println("Servlet Object is created!");
	}
	

	public void init(ServletConfig config) throws ServletException   // then servlet will be initialized
	{
		System.out.println("Servlet initialized!");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service method to handle http request and to response back");
	}
	
	public void destroy() 
	{
		
	}
}
