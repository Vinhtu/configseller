package DAO;

import java.util.List;

import Model.PromotionModel;

public interface IPromotionDAO  extends GenericDAO<PromotionModel>{
	PromotionModel getPromotionOne(int id);
	List<PromotionModel> getPromotionAll();
	Long save(PromotionModel promotionModel);
	void update(PromotionModel updatePromotionModel);
	void delete(int id);
}
