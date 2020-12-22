package Service;

import java.util.List;

import Model.PromotionModel;

public interface IPromotionService {
	
	PromotionModel  getPromotionOne(int id);
	List<PromotionModel> getPromotionAll();
	PromotionModel save(PromotionModel promotionModel);
	PromotionModel update(PromotionModel promotionModel);
	void delete(int id);
	


}
