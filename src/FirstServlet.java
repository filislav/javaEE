import somePackage.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession httpSession = request.getSession(); //создаем объект Session
        Cart cart = (Cart)httpSession.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity = Integer.valueOf(request.getParameter("quantity"));
        if(cart==null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
            httpSession.setAttribute("cart", new Cart());
        }
        httpSession.setAttribute("cart",cart);

        Integer count = (Integer)httpSession.getAttribute("count");
        if(count==null){
            httpSession.setAttribute("count",1);
            count=1;
        }else{
            httpSession.setAttribute("count", count + 1); //добавляем для сессии пользователя новый атрибут
        }
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);


        //response.sendRedirect("https://www.google.com"); //перенаправляет на другой сайт, пернаправление происходит на стороне пользователя от сервера мы принимаем код 300(redirect) и адрес
        // страницы на который редиректится
        //response.sendRedirect("/testingJSP.jsp"); //redirect на jsp страницу.

        //Далее будет forward - он выполняется только на сервере и не может перенаправлять на другие сайты
    }
}
