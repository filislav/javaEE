import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter pw = response.getWriter(); // с помощью объекта PrintWriter мы можем писать в объект response
        pw.println("<html>");
        pw.println("<h1>Hello world</h1>");
        pw.println("</html>");
    }
}
