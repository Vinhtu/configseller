package Service.impl;

import java.util.List;

import DAO.IUserDAO;
import DAO.impl.UserDAO;
import Model.UserModel;
import Service.IUserService;

public class UserService  implements IUserService {

	private IUserDAO roleDao;
	
	@Override
	public UserModel findByAccountStatus(String username, String password) {
		return roleDao.findByAccountStatus(username, password);
	}
	
	public UserService() {
		roleDao = new UserDAO();
	}
	


	@Override
	public UserModel getUserDetail(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserModel> getUserAll() {
		return roleDao.getUserAll();
	}

	@Override
	public UserModel save(UserModel roleModel) {
		Long id_product =  roleDao.save(roleModel);
		return roleDao.findOne(id_product);
	}

	@Override
	public UserModel update(UserModel roleModel) {
		roleDao.update(roleModel);
		return roleDao.findOne((long) roleModel.getId());
	}

	@Override
	public void delete(int id) {
		roleDao.delete(id);
	}

}
