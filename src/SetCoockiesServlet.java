import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCoockiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("some_id","1"); //cookie это пара ключ-значение по которой происходит идентификация клиента(броузера) на сайте - это строковые значения
        Cookie cookie2 = new Cookie("some_name","Slava");
        cookie1.setMaxAge(24*60*60); //срок хранения куки в броузере в сек, здесь один день 60 сек * 60мин * 24 часа
        cookie2.setMaxAge(24*60*60);
        response.addCookie(cookie1);
        response.addCookie(cookie2);

    }
}
