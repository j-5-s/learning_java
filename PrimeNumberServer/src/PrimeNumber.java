

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import com.homedepot.headfirst.Numbers;
import com.homedepot.headfirst.PrimeNumbers;
/**
 * Servlet implementation class PrimeNumber
 */
public class PrimeNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Numbers n = new Numbers();
    
	String newForm = "";


	/**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeNumber() {
        super();
        // TODO Auto-generated constructor stub
        newForm +=  "<FORM METHOD=POST ACTION=\"\">";
        newForm += "<p><label for=\"name\">Please enter a number</label>";
        newForm += "<INPUT TYPE=text NAME=\"number\"></p>";
        newForm +="<INPUT TYPE=submit VALUE=\"Submit\">";
        newForm += "</FORM>";
    }

    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<HTML>");
	    out.println("  <HEAD>");
	    out.println("    <TITLE>Who's There?</TITLE>");
	    out.println("  </HEAD>");
	    out.println("  <BODY>");
	    out.println(newForm);
	    out.println("  </BODY>");
	    out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    Integer i = Integer.parseInt(request.getParameter("number"));
	    String result = n.isPrime(i);
	    
	    out.println("<HTML>");
	    out.println("  <HEAD>");
	    out.println("    <TITLE>Welcome</TITLE>");
	    out.println("  </HEAD>");
	    out.println("  <BODY>");
	    out.println(result);
	    out.println(newForm);
	    out.println("  </BODY>");
	    out.println("</HTML>");
	}

}
