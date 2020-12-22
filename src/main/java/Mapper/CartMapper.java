package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.AccountModel;
import Model.CartModel;

public class CartMapper implements IRowMapper<CartModel>{

	@Override
	public CartModel mapRow(ResultSet resultSet) {
		try {
			CartModel  cartModel = new CartModel();
			cartModel.setId(resultSet.getInt("id"));
			cartModel.setU_id(resultSet.getInt("u_id"));
			cartModel.setBuyDate(resultSet.getString("buyDate"));
			return cartModel;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
