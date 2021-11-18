package demo.servlet;

import demo.dao.CompanyDao;
import demo.entity.CompanyEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InsertCompanyServlet",urlPatterns = "/addCompany")
public class InsertCompanyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        CompanyEntity companyEntity = new CompanyEntity(name);
        CompanyDao dao = new CompanyDao();

        dao.insertCompany(companyEntity);
        response.sendRedirect("company");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("addCompany.jsp").forward(request, response);
    }
}