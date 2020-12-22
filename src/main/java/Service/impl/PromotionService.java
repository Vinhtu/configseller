package Service.impl;

import java.util.List;

import DAO.IPromotionDAO;
import DAO.impl.PromotionDAO;
import Model.PromotionModel;
import Service.IPromotionService;

public class PromotionService implements IPromotionService{

	
	private IPromotionDAO promotionDao;
	
	public PromotionService() {
		promotionDao = new PromotionDAO();
	}
	
	
	@Override
	public PromotionModel getPromotionOne(int id) {
		return promotionDao.getPromotionOne(id);
	}

	@Override
	public List<PromotionModel> getPromotionAll() {
		return promotionDao.getPromotionAll();
	}

	@Override
	public PromotionModel save(PromotionModel promotionModel) {
		Long id =promotionDao.save(promotionModel);
		return null;
	}

	@Override
	public PromotionModel update(PromotionModel promotionModel) {
		promotionDao.update(promotionModel);
		return null;
	}

	@Override
	public void delete(int id) {
		promotionDao.delete(id);
	}

}
