package DAO.impl;

import java.util.List;

import DAO.IPromotionDAO;
import Mapper.PromotionMapper;
import Model.PromotionModel;

public class PromotionDAO extends AbstractDAO<PromotionModel> implements IPromotionDAO{

	@Override
	public PromotionModel getPromotionOne(int id) {
		String sql = "Select * from promotion where id = ?";
		List<PromotionModel> promotion =  query(sql, new PromotionMapper(), id);
		return promotion.isEmpty() ? null :  promotion.get(0);
	}

	@Override
	public List<PromotionModel> getPromotionAll() {
		String sql = "Select * from promotion";
		return query(sql, new PromotionMapper());
	}

	@Override
	public Long save(PromotionModel promotionModel) {
		String sql  = "INSERT INTO promotion(code, name,percent, img, alt_img ) values (?,?,?,?,?) ";
		return insert(sql, promotionModel.getCode(), promotionModel.getName(), promotionModel.getPercent(), promotionModel.getImg(), promotionModel.getAlt_img());
	}

	@Override
	public void update(PromotionModel updatePromotionModel) {
		String sql = "Update promotion set code = ?, name = ?, percent =? , img = ? , alt_img = ?  where id = ?";
		 insert(sql.toString(),updatePromotionModel.getCode(), updatePromotionModel.getName(), updatePromotionModel.getPercent(), updatePromotionModel.getImg(), updatePromotionModel.getAlt_img(),updatePromotionModel.getId() );
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM promotion WHERE id = ? ";
		update(sql,id);
	}

	

}
