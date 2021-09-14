package demo_servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletConfig_servletContext extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		PrintWriter out = res.getWriter();
		System.out.println("Hello");
		
		ServletContext context = req.getServletContext();
		String context_str = context.getInitParameter("name");
		
		ServletConfig config = getServletConfig();
		String config_str = config.getInitParameter("name");
		
		System.out.println(context_str);
	}
}
