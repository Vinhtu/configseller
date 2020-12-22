package DAO.impl;

import java.util.List;

import DAO.IAccountDAO;
import Mapper.AccountMapper;
import Mapper.CategoryMapper;
import Model.AccountModel;

public class AccountDAO extends AbstractDAO<AccountModel> implements IAccountDAO {

	@Override
	public AccountModel findByAccountStatus(String username, String password	) {

//	   StringBuilder sql = new StringBuilder( "Select * from account as a");
//	   sql.append("inner join role as r on r.id_role=a.id_account");
//	   sql.append("where username = ? and password = ?");
		String sql = "Select * from account where  username = ? and password = ?";
	   List<AccountModel> accounts  = query(sql.toString(),new AccountMapper(), username, password);
	   return accounts.isEmpty() ? null : accounts.get(0) ;
	}

	@Override
	public Long addAccount(AccountModel accountModel) {
		String sql = "Insert into account(username,password,role) values(?,?,?)";
		return insert(sql,accountModel.getUsername(), accountModel.getPassword(), accountModel.getRole());
	}

	@Override
	public List<AccountModel> getAccountAll() {
		String sql = "Select * from account";
		return query(sql, new AccountMapper());
	}

	@Override
	public void update(AccountModel accountModel) {
		String sql = "UPDATE account SET username = ?, password = ?, role =? , status = ? ";
		 insert(sql.toString(), accountModel.getUsername() , accountModel.getPassword(), accountModel.getRole(), accountModel.getStatus());
		
	}

	@Override
	public void delete(int id) {
	   String sql ="Delete from product where id= ?";
	   update(sql, id);
		
	}
	
	

}
