package demo.servlet;

import demo.dao.CompanyDao;
import demo.entity.CompanyEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateCompanyServlet",urlPatterns = "/updateCompany")
public class UpdateCompanyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CompanyDao dao = new CompanyDao();
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        CompanyEntity companyEntity =new CompanyEntity(id, name);
        dao.updateCompany(companyEntity);
        response.sendRedirect("company");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}