import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");//параметр это то что идет после знака вопроса http://localhost:8080/hw?name=slava
        String surName = request.getParameter("surname");//второй параметр передается через знак & - http://localhost:8080/hw?name=Bob&surname=Bobov порядок не важен все равно все сматчится корректно
        PrintWriter pw = response.getWriter(); // с помощью объекта PrintWriter мы можем писать в объект response
        pw.println("<html>");
        pw.println("<h1>Hello, " + name + " " + surName + " </h1>");
        pw.println("</html>");
    }
}
