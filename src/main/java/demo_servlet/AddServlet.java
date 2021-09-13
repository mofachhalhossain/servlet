package demo_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*import org.apache.el.parser.AstInteger;
import org.eclipse.jdt.internal.compiler.codegen.IntegerCache;*/


public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = num1+num2;
		
		/*
		 * PrintWriter out = res.getWriter(); out.println("Sum: "+sum);
		 */
		
		/*
		 * RequestDispatcher requestDispatcher = req.getRequestDispatcher("sqr");
		 * requestDispatcher.forward(req, res);
		 * req.setAttribute("sum", sum);
		 */
		
		res.sendRedirect("sqr?sum="+sum);
	}
}