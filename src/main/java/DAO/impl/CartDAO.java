package DAO.impl;

import java.util.List;

import DAO.ICartDAO;
import Mapper.CartMapper;
import Mapper.ProductMapper;
import Model.CartModel;
import Model.ProductModel;

public class CartDAO extends AbstractDAO<CartModel> implements ICartDAO {

	@Override
	public List<CartModel> getCartAll() {
		String sql  = "Select * from cart";
		return query(sql, new CartMapper());
	}

	@Override
	public CartModel getOne(Long id) {
		String sql  = "Select * from cart where id = ?";
		List<CartModel> cart =  query(sql, new CartMapper(), id);
		return cart.isEmpty() ? null :  cart.get(0);
	}

	@Override
	public Long save(CartModel cartModel) {
		String sql  = "INSERT INTO cart(u_id,buyDate) VALUES(?,?)";
		return insert(sql, cartModel.getU_id(),cartModel.getBuyDate());
	}

	@Override
	public void update(CartModel cartModel) {
		String sql = "UPDATE cart SET u_id = ? , buyDate = ?  WHERE id =?"; 
		  insert(sql,  cartModel.getU_id(), cartModel.getBuyDate(), cartModel.getId());	
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM cart WHERE id = ?";
		update(sql, id);
		
	}




	
}
