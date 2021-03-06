package demo.servlet;

import demo.dao.CompanyDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteCompanyServlet",urlPatterns = "/deleteCompany")
public class DeleteCompanyServlet extends HttpServlet {
    CompanyDao companyDao = new CompanyDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        companyDao.deleteCompany(id);
        response.sendRedirect("company");
    }
}