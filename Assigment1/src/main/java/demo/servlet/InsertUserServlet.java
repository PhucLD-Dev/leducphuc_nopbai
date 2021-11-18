package demo.servlet;

import demo.dao.CompanyDao;
import demo.dao.UserDao;
import demo.entity.CompanyEntity;
import demo.entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 50, // 50MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB

@WebServlet(name = "InsertUserServlet", urlPatterns = {"/addUser"})
public class InsertUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            String address = request.getParameter("address");

            int companyid = Integer.parseInt(request.getParameter("company"));

            UserDao dao = new UserDao();
            UserEntity user = new UserEntity(name, age, address, companyid);
            dao.insertUser(user);
            response.sendRedirect("user");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CompanyDao dao = new CompanyDao();
        List<CompanyEntity> companyEntities = dao.getAllCompany();
        request.setAttribute("company", companyEntities);
        request.getRequestDispatcher("UserInsert.jsp").forward(request, response);
    }

}
