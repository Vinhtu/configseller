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
 * Servlet implementation class ProductDetail
 */
@WebServlet("/product-detail")
public class ProductDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	private IProductService productService;
	
    public ProductDetail() {
        productService = new ProductService();
       
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_product = request.getParameter("id");
		request.setAttribute("productDetail", productService.getProductDetail(Integer.parseInt(id_product)));
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/user/ProductDetail.jsp");
		rd.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
