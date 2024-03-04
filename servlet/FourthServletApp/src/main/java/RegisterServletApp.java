

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegisterServletApp extends HttpServlet {       
    public RegisterServletApp() {
    	System.out.println("Servlet Obj is created internally by container");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String ucity=request.getParameter("ucity");
		response.sendRedirect("/FourthServletApp/success.jsp");
		
	}

}
