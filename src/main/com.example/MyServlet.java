package main.com.example;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//
@WebServlet("/hello")
//public class MyServlet extends HttpServlet {
//
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
//    }
//        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
//            // response.setContentType("text/html");
//
//            PrintWriter out = response.getWriter();
//            // out.println("<html><body>");
//            out.println("<h2>Hello world!</h2>");
//            // out.println("</body></html>");
//        }
//    }

public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // Initialization code here
        System.out.println("Servlet is being initialized");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle GET request here
        resp.getWriter().write("Handling GET request");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle POST request here
        resp.getWriter().write("Handling POST request");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle PUT request here
        resp.getWriter().write("Handling PUT request");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle DELETE request here
        resp.getWriter().write("Handling DELETE request");
    }

    @Override
    public void destroy() {
        // Cleanup code here
        System.out.println("Servlet is being destroyed");
    }
}



