package demo_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sqr")
public class SqrServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		/* int s = Integer.parseInt(req.getParameter("sum")); */
		
		/*
		 * HttpSession session = req.getSession(); int s =
		 * (int)session.getAttribute("sum");
		 */
		
		int s = 0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies) {
			if(c.getName().equals("sum")) {
				s = Integer.parseInt(c.getValue());
			}
		}
		
		s = s*s;
		 
		PrintWriter out = res.getWriter();
		out.println("Square "+s);
		 

		System.out.println("Sqr called");
	}
}
