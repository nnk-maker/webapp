import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;

public class DataTime extends HttpServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		Date d= new Date();
		PrintWriter out=res.getWriter();
		out.println(d);
	}



}