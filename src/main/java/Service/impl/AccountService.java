package Service.impl;

import java.util.List;

import DAO.IAccountDAO;
import DAO.impl.AccountDAO;
import Model.AccountModel;
import Service.IAccountService;

public class AccountService implements IAccountService{
    
	
	private IAccountDAO accountDao;
	public AccountService() {
		accountDao = new AccountDAO();
		
	}
	
	@Override
	public AccountModel findByAccountStatus(String username, String password) {
		return accountDao.findByAccountStatus(username, password);
	}

	@Override
	public AccountModel addAccount(AccountModel accountModel) {
	    Long id = accountDao.addAccount(accountModel);
	     return null;
	}

	@Override
	public List<AccountModel> getAccountAll() {
		return  accountDao.getAccountAll();
	}


    
}
