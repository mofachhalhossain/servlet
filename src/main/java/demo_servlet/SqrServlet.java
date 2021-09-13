package demo_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int s = Integer.parseInt(req.getParameter("sum"));
		s = s*s;
		 
		PrintWriter out = res.getWriter();
		out.println("Square "+s);
		 

		System.out.println("Sqr called");
	}
}
