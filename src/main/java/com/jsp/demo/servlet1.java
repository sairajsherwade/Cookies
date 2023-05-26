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
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	     	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name= req.getParameter("name");
	
//		
//		Cookie cookie= new Cookie("cname", name);
//		resp.addCookie(cookie);
		
		HttpSession htpHttpSession= req.getSession();
		htpHttpSession.setAttribute("sname", name);
		
		PrintWriter printWriter= resp.getWriter();
		
		printWriter.print("<html><body><h1>"+ "welcome"+name+"to my website"+"</h1></body></html>");
		printWriter.print("<a href='servlet2'> go to servlet2 </a>");	

}
}