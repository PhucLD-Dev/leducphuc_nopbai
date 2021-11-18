package demo.servlet;

import demo.dao.CompanyDao;
import demo.dao.UserDao;
import demo.entity.CompanyEntity;
import demo.entity.UserEntity;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EditUserServlet",urlPatterns = "/editUser")
public class EditUserServlet extends HttpServlet {
    UserDao userDao = new UserDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CompanyDao dao = new CompanyDao();
        List<CompanyEntity> companyEntities = dao.getAllCompany();
        request.setAttribute("company", companyEntities);
        int id = Integer.parseInt(request.getParameter("id"));
        UserEntity existingUser = userDao.getUser(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("UserEdit.jsp");
        request.setAttribute("edituser", existingUser);
        dispatcher.forward(request, response);
    }
}
