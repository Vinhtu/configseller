package DAO.impl;

import java.util.List;

import DAO.IProductDAO;
import Mapper.ProductMapper;
import Model.ProductModel;

public class ProductDAO extends AbstractDAO<ProductModel>  implements IProductDAO {

	@Override
	public List<ProductModel> findProductId() {
		String sql = "SELECT * FROM product";
		return query(sql, new ProductMapper());
	}


	@Override
	public List<ProductModel> getProductAll() {
		String sql = "SELECT * FROM product";
		return query(sql, new ProductMapper());
	}
	@Override
	public Long save(ProductModel productModel) {
		String sql  = "INSERT INTO product(name, img,alt_img, price, description ,promotion_id, category_id, createByDate, num_product) VALUES (?,?,?,?,?,?,?,?,?) ";
		return insert(sql, productModel.getName(), productModel.getImg(), productModel.getAlt_img(), productModel.getPrice(), productModel.getDescription(), productModel.getPromotion_id(), productModel.getCategory_id(), productModel.getCreateByDate(), productModel.getNum_product() );
	}

	@Override
	public ProductModel findOne(Long id) {
		String sql = "SELECT * FROM product Where id = ?";
		List<ProductModel> product =  query(sql, new ProductMapper(), id);
		return product.isEmpty() ? null :  product.get(0);
	}

	@Override
	public void update(ProductModel updateProductModel) {
		String sql = "UPDATE product SET name = ? , img = ?, alt_img = ? , price = ? ,description = ?, promotion_id = ?,category_id = ?, createByDate = ? , num_product = ?  WHERE id =?"; 
		  insert(sql,  updateProductModel.getName(), updateProductModel.getImg(), updateProductModel.getAlt_img(), updateProductModel.getPrice(), 
				  updateProductModel.getDescription(),updateProductModel.getPromotion_id(),updateProductModel.getCategory_id(),
				  updateProductModel.getCreateByDate() ,updateProductModel.getNum_product(),  updateProductModel.getId());
	}


	@Override
	public void delete(int id) {
		
		String sql = "DELETE FROM product WHERE id = ?";
		update(sql, id);
		
	}


	@Override
	public List<ProductModel> getTopProducts() {
		String sql = "Select * from product where type = 'top product'";
		return query(sql, new ProductMapper());
	}


	@Override
	public List<ProductModel> getNewProducts() {
		String sql = "Select * from product where type = 'new product'";
		return query(sql, new ProductMapper());
	}


	@Override
	public List<ProductModel> getMenShoes() {
		String sql = "Select * from product, category where product.category_id = category.id and category.code = 'giay-nam' ";
		return query(sql,new ProductMapper());
	}


	@Override
	public List<ProductModel> getWomenShoes() {
		String sql = "Select * from product, category where product.category_id = category.id and category.code = 'giay-nu' ";
		return query(sql, new ProductMapper());
	}


	@Override
	public List<ProductModel> getChildrenShoes() {
		String sql = "Select * from product, category where product.category_id = category.id and category.code = 'giay-tre-em' ";
		return query(sql, new ProductMapper());
	}


	@Override
	public ProductModel getProductDetail(int id) {
		System.out.println(id + "id");
		String sql = "SELECT * FROM product Where id = ?";
		List<ProductModel> product =  query(sql, new ProductMapper(), id);
		return product.isEmpty() ? null :  product.get(0);
	}




	



}
