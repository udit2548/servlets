import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String upassword = request.getParameter("password");
		String ucity = request.getParameter("ucity");
		
		// now send the data collected from form to be stored in database, to which we have to follow following
		// steps
		
		// 1. Load and Register the driver..
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbclearning";
			String user="root";
			String password="makkar@123";
			//2. Establish the connection
			 Connection connect = DriverManager.getConnection(url,user,password);
				//3. Now making a statement (preparedStatement)
			 PreparedStatement pstmnt = connect.prepareStatement("INSERT INTO personalInfo (uname, email, upassword, ucity) "
						+ "VALUES(?,?,?,?)");
			     pstmnt.setString(1,uname);
			     pstmnt.setString(2,email);
			     pstmnt.setString(3,upassword);
			     pstmnt.setString(4,ucity);
			     
			    int rowAffected = pstmnt.executeUpdate();
			    PrintWriter writer = response.getWriter();
			    if(rowAffected!=0) {
			    	writer.println("<h1>Registered Successfully</h1>");
			    }
			    else {
			    	writer.println("<h1>User not Registered!</h1>");
			    }
			    System.out.println(rowAffected);
			    pstmnt.close();
			    connect.close();
		} 
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
