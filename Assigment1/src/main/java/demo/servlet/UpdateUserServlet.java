package demo.servlet;

import demo.dao.UserDao;
import demo.entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateUserServlet",urlPatterns = "/updateUser")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            UserDao dao = new UserDao();
            UserEntity userEntity = new UserEntity();
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            String address = request.getParameter("address");
            int companyid = Integer.parseInt(request.getParameter("company"));


            UserEntity user = new UserEntity(id,name, age, address, companyid);
            dao.updateUser(user);
            response.sendRedirect("user");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("user.jsp").forward(request, response);
    }
}
