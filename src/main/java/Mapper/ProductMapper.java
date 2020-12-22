package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import Model.ProductModel;

public class ProductMapper implements IRowMapper<ProductModel> {
	@Override
	public ProductModel mapRow(ResultSet resultSet) {
		try {	
			ProductModel product = new ProductModel();
			product.setId(resultSet.getInt("id"));
			product.setName(resultSet.getString("name"));
			product.setPrice(resultSet.getString("price"));
			product.setImg(resultSet.getString("img"));
			product.setAlt_img(resultSet.getString("alt_img"));
			product.setDescription(resultSet.getString("description") );
			product.setCreateByDate(resultSet.getString("createByDate") );
			product.setNum_product(resultSet.getString("num_product") );
			product.setPromotion_id(resultSet.getString("promotion_id") );
			product.setCategory_id(resultSet.getString("category_id") );
			product.setType(resultSet.getString("type") );
			return product;
		}catch(SQLException e) {
			return null;
		}
	}
}
