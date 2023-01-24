

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
System.out.println("Servlet1 doGet() called");		
String name=request.getParameter("UserName");
System.out.println("User name is:"+name);
RequestDispatcher rd=request.getRequestDispatcher("/one.jsp");
rd.forward(request,response);
}
}
