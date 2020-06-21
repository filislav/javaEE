import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

public class DeleteCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Optional<Cookie>cookie = Stream.of(request.getCookies()).filter(e->e.getName().equals("some_id")).findFirst();
        try {
            Cookie cook = cookie.orElseThrow(NullPointerException::new);
            cook.setMaxAge(0);
            response.addCookie(cook);
        }catch(NullPointerException e){
            e.getMessage();
        }
        //cookie.ifPresent(e->e.setMaxAge(-1)); - это валидное значение, говорит о том уто cookies удалятся когда пользователь закроет броузер
    }
}
