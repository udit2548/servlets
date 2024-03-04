

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet {
	
	public FirstServletApp() {
		// Object is created internally, because we as a developer are not creating any project,
		// and moreover it is executed by servlet container or web container not by JVM
		System.out.println("Object created internally!");
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
		// Fetching data from client... side, that's why--> request object 
		String name=request.getParameter("uname");
		String ucity=request.getParameter("ucity");
		
		// Generating Response from server --> response object
		  PrintWriter writer = response.getWriter();
		  writer.println("Hi!!"+name);
		  writer.println("I know you belong from "+ucity);
		  
		  writer.close();

	}

}
