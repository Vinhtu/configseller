package controller.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.IProductService;
import Service.impl.ProductService;

/**
 * Servlet implementation class Category
 */
@WebServlet("/category")
public class Category extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IProductService productService;
	
	
    public Category() {
         productService = new ProductService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action != null && action.equals("giay-nam")) {
			   request.setAttribute("products", productService.getMenShoes());
				RequestDispatcher rd = request.getRequestDispatcher("views/user/category.jsp");
				rd.forward(request, response);
		}
		else if(action != null && action.equals("giay-nu")) {
			   request.setAttribute("products", productService.getWomenShoes());
				RequestDispatcher rd = request.getRequestDispatcher("views/user/category.jsp");
				rd.forward(request, response);
		}
		else {
			 request.setAttribute("products", productService.getChildrenShoes());
				RequestDispatcher rd = request.getRequestDispatcher("views/user/category.jsp");
				rd.forward(request, response);
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
