package DAO;

import java.util.List;

import Model.AccountModel;

public interface IAccountDAO extends GenericDAO<AccountModel> {
	AccountModel findByAccountStatus(String username, String password);
	List<AccountModel> getAccountAll();
	Long addAccount(AccountModel accountModel );
	void update(AccountModel accountModel);
	void delete(int id);

}
