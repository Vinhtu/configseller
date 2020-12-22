package DAO.impl;

import java.util.List;

import DAO.ICartItemDAO;
import Mapper.CartItemMapper;
import Mapper.CartMapper;
import Model.CartItemModel;
import Model.CartModel;

public class CartItemDAO extends AbstractDAO<CartItemModel> implements ICartItemDAO {

	@Override
	public List<CartItemModel> getAll() {
		String sql  = "select * from cartItem";
		return query(sql,new CartItemMapper());
	}


	@Override
	public Long save(CartItemModel cartItemModel) {
		String sql  = "INSERT INTO cartItem(cart_id, pro_id, quantity, unitPrice) VALUES(?,?,?,?) ";
		return insert(sql, cartItemModel.getCart().getId(), cartItemModel.getPro_id(), cartItemModel.getQuantity(), cartItemModel.getUnitPrice());
	}

	@Override
	public void update(CartItemModel cartItemModel) {
		String sql = "UPDATE cartItem SET cart_id = ? , pro_id = ?, quantity = ? , unitPrice = ?  WHERE id =?"; 
		  insert(sql, cartItemModel.getCart_id(), cartItemModel.getPro_id(), cartItemModel.getQuantity(), cartItemModel.getUnitPrice(), cartItemModel.getId());
	
		
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM cartItem WHERE id = ?";
		update(sql, id);
		
	}


	@Override
	public CartItemModel getOne(int id) {
		String sql  = "Select * from cartItem where id = ?";
		List<CartItemModel> cartItem =  query(sql, new CartItemMapper(), id);
		return cartItem.isEmpty() ? null :  cartItem.get(0);
	}

}
