package demo.servlet;

import demo.dao.CompanyDao;
import demo.entity.CompanyEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CompanyServlet",urlPatterns = {"/company"})
public class CompanyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CompanyDao dao = new CompanyDao();
        List<CompanyEntity> company = dao.getAllCompany();
        request.setAttribute("company", company);
        request.getRequestDispatcher("Company.jsp").forward(request, response);
    }
}