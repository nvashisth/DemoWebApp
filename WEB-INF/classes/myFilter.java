import javax.servlet.*;
import java.io.*;
public class myFilter implements Filter
{
public void init(FilterConfig config){}
public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("filter message");
chain.doFilter(req,res);
}
public void destroy(){}
}