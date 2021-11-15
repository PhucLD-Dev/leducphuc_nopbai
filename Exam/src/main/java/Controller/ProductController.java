package Controller;

import dao.ProductDao;
import model.tbProducts;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * Servlet implementation class PondController
 */
//@WebServlet("/PondController")
@WebServlet(name = "ProductController",urlPatterns = {"/product"})
public class ProductController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao productDao  = new ProductDao();
		List<tbProducts> products = productDao.getAllProduct();
		request.setAttribute("products", products);
		request.getRequestDispatcher("product.jsp").forward(request, response);
	}
}
