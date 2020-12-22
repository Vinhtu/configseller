package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.AccountModel;
import Model.UserModel;

public class AccountMapper implements IRowMapper<AccountModel> {

	@Override
	public AccountModel mapRow(ResultSet resultSet) {
		try {
			AccountModel  accountModel = new AccountModel();
			accountModel.setId(resultSet.getInt("id"));
			accountModel.setUsername(resultSet.getString("username"));
			accountModel.setPassword(resultSet.getString("password"));
//			accountModel.setStatus(resultSet.getString("status"));
//			accountModel.setRole(resultSet.getString("role"));
//			try {
//				RoleModel role = new RoleModel();
//				role.setCode(resultSet.getString("code"));
//				role.setName(resultSet.getString("name"));
//				accountModel.setRole(role);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			
			return accountModel;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
