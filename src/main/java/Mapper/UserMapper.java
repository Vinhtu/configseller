package Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.ProductModel;
import Model.UserModel;

public class UserMapper implements IRowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet resultSet) {
		try {	
			UserModel user = new UserModel();
			user.setId(resultSet.getInt("id"));
			user.setAvatar(resultSet.getString("avatar"));
			user.setUsername(resultSet.getString("username"));
			user.setPassword(resultSet.getString("password"));
			user.setFirstname(resultSet.getString("firstname"));
			user.setLastname(resultSet.getString("lastname"));
			user.setRole(resultSet.getString("role"));
			user.setBirthdate(resultSet.getString("birthdate"));
			user.setAddress(resultSet.getString("address"));
			user.setCity(resultSet.getString("city"));
			user.setCountry(resultSet.getString("country"));
			user.setPhone(resultSet.getString("phone"));
			user.setCreatebydate(resultSet.getString("createbydate"));
			user.setStatus(resultSet.getString("status"));
			return user;
		}catch(SQLException e) {
			return null;
		}
	}

}
