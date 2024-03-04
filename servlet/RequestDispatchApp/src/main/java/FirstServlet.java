

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     System.out.println("Control is in First Servlet");
     String name=request.getParameter("uname");
     String city=request.getParameter("ucity");
     RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServlet");
     // Dispatching data to another servlets (Concepts of Session)
         HttpSession session = request.getSession();
         // setting or sending the data for a particular session, so that other servlets or controllers can use
         // it in the application in the same session time-interval.
         session.setAttribute("name",name);
         session.setAttribute("city",city);
         
         session.setMaxInactiveInterval(20000); // means session data will be expired after given time interval.
         
     // Dispatching request to another servlet
     reqDispatch.forward(request, response);
     //reqDispatch.include(request, response);
      PrintWriter writer = response.getWriter();
      writer.println("<h1>Response from Servlet 1</h1>");
      writer.close();
     
 
	}

}
