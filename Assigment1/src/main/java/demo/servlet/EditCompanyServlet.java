package demo.servlet;

import demo.dao.CompanyDao;
import demo.entity.CompanyEntity;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "EditCompanyServlet",urlPatterns = "/editCompany")
public class EditCompanyServlet extends HttpServlet {
    CompanyDao companyDao = new CompanyDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        CompanyEntity existingUser = companyDao.getCompany(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editCompany.jsp");
        request.setAttribute("company", existingUser);
        dispatcher.forward(request, response);
    }
}

