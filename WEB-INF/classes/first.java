import javax.servlet.*;
import java.io.*;
public class first implements Servlet
{
public void init(ServletConfig config){}
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("first servlet called");
}
public ServletConfig getServletConfig(){return null;}
public String getServletInfo(){return null;}
public void destroy(){}
}