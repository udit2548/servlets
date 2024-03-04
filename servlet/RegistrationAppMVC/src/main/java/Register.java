

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/Register")
public class Register extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String emailID = request.getParameter("email");
		String upassword = request.getParameter("password");
		String ucity = request.getParameter("ucity");
		
		Model model = new Model();
		model.setUname(uname);
		model.setEmail(emailID);
		model.setUpassword(upassword);
		model.setUcity(ucity);
		
		int row=model.register();
		HttpSession session = request.getSession();
		session.setAttribute("name",uname);
		
		if(row==0) {
			response.sendRedirect("/RegistrationAppMVC/failure.jsp");
		}
		else {
			response.sendRedirect("/RegistrationAppMVC/success.jsp");
		}
	}

}
