package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet2")
public class servlet2  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String name=req.getParameter("name");
    String   tname=null;
//      
//   Cookie cookies[] = req.getCookies();
//   
//   for(Cookie c :cookies) {
//	   
//	   if(c.getName().equals("cname"));
//	   tname=c.getValue();	   
    
    
//   }
    
    
    
    	HttpSession httpSession=req.getSession();
   tname=(String) 	httpSession.getAttribute("sname");
			
		PrintWriter printWriter= resp.getWriter();
		
		printWriter.print("<html><body><h1>"+ "welcome" + tname +"to my website"+"</h1></body></html>");
		printWriter.print("<a href='servlet3'> logout</a>");
	}	

}
