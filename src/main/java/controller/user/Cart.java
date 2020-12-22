package controller.user;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.CartItemModel;
import Model.ProductModel;
import Service.ICartService;
import Service.IProductService;
import Service.impl.CartService;
import Service.impl.ProductService;

/**
 * Servlet implementation class Cart
 */
@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ICartService cart;
	private IProductService productService;
	
    public Cart() {
      	cart = new CartService();
      	productService = new ProductService();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		int quantity =1 ;
		
     
        if(request.getParameter("quantity") != null) {
        	quantity = Integer.parseInt(request.getParameter("quantity"));
        }
	      if(action != null && action.equals("add") ) {
	    	  
			String pId = request.getParameter("id");
			ProductModel product = productService.getProductDetail(Integer.parseInt(pId));
			CartItemModel cartItem = new CartItemModel();
			cartItem.setQuantity(quantity);
			cartItem.setUnitPrice(product.getPrice());
			cartItem.setProduct(product);
			HttpSession httpSession = request.getSession();
			Object obj = httpSession.getAttribute("cart");
			System.out.println(obj+ "obj");
			if (obj == null) {
				
				Map<Integer, CartItemModel> map = new HashMap<Integer, CartItemModel>();
				map.put(cartItem.getProduct().getId(), cartItem);
				httpSession.setAttribute("cart", map);
				RequestDispatcher rd = request.getRequestDispatcher("/views/user/Cart/index.jsp");
				rd.forward(request, response);

			} else {
				Map<Integer, CartItemModel> map = (Map<Integer, CartItemModel>) obj;

				CartItemModel existedCartItem = map.get(Integer.valueOf(pId));

				if (existedCartItem == null) {
					map.put(product.getId(), cartItem);
				} else {
					existedCartItem.setQuantity(existedCartItem.getQuantity() + quantity);
				}

				httpSession.setAttribute("cart", map);
			}
	      }
	      else if(action != null && action.equals("remove")) {
	    	  HttpSession httpSession = request.getSession();
	  		Object obj = httpSession.getAttribute("cart");
	  		String pId = request.getParameter("id");
	  		if (obj != null) {
	  			Map<Integer, CartItemModel> map = (Map<Integer, CartItemModel>) obj; 
	  			map.remove(Integer.parseInt(pId));
	  			httpSession.setAttribute("cart", map);
	  		}	  
	      }
	      HttpSession httpSession = request.getSession();
	      Object obj = httpSession.getAttribute("cart");
	      RequestDispatcher rd = request.getRequestDispatcher("/views/user/Cart/index.jsp");
			rd.forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int quantity= 1;
//		int id;
//		if(request.getParameter("id")!= null) {
//			id = Integer.parseInt(request.getParameter("id"));
//			ProductModel productModel = productService.getProductDetail(id);
//			
//			if(productModel != null) {
//				if(request.getParameter("quantity") != null) {
//					quantity  = Integer.parseInt(request.getParameter("quantity"));
//					
//				}
//				HttpSession session = request.getSession();
//				if (session.getAttribute("order") == null){
//					OrderModel order = new OrderModel();
//					List<CartItemModel> listItems = new ArrayList<CartItemModel>();
//					CartItemModel cartItems = new CartItemModel();
//					cartItems.setQuantity(quantity);
//					cartItems.setProductModel(productModel);
//					cartItems.setPrice(productModel.getPrice());
//					listItems.add(cartItems);
//					order.setCartItems(listItems);
//					System.out.println("ket qua " +" - "+order.getCartItems().size()+ "-info");
//					session.setAttribute("order", order);
//					
//					
//				}else {
//					OrderModel order = (OrderModel) session.getAttribute("order");
//					List<CartItemModel> listItems = order.getCartItems();
//					boolean check = false;
//					for(CartItemModel cartItem : listItems) {
//						if(cartItem.getProductModel().getId()  == productModel.getId()) {
//							cartItem.setQuantity(cartItem.getQuantity() + quantity);
//							check = true; 
//						}
//						
//					}
//					if(check = false) {
//						CartItemModel cartItem = new CartItemModel();
//						cartItem.setQuantity(quantity);
//						cartItem.setProductModel(productModel);
//						cartItem.setPrice(productModel.getPrice());
//						listItems.add(cartItem);
//					}
//					System.out.println("ket qua " +" - "+order.getCartItems().size()+ "-info2");
//					session.setAttribute("order", order);
//
//				}
//			}
//			RequestDispatcher rd = request.getRequestDispatcher("/views/user/Cart/index.jsp");
//			rd.forward(request, response);
//		}else {
//		RequestDispatcher rd = request.getRequestDispatcher("/views/user/Cart/index.jsp");
//		rd.forward(request, response);
//		}
	
	}
}
