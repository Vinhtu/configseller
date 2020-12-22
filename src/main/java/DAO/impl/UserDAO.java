package DAO.impl;

import java.util.List;

import DAO.IUserDAO;
import Mapper.UserMapper;
import Model.UserModel;

public class UserDAO  extends AbstractDAO<UserModel> implements IUserDAO {

	@Override
	public UserModel findByAccountStatus(String username, String password	) {

//	   StringBuilder sql = new StringBuilder( "Select * from account as a");
//	   sql.append("inner join role as r on r.id_role=a.id_account");
//	   sql.append("where username = ? and password = ?");
		String sql = "Select * from users where  username = ? and password = ?";
	   List<UserModel> accounts  = query(sql.toString(),new UserMapper(), username, password);
	   return accounts.isEmpty() ? null : accounts.get(0) ;
	}
	@Override
	public UserModel getUserDetail(int id) {
		return null;
	}

	@Override
	public List<UserModel> getUserAll() {
		String sql = "Select * from users";
		return query(sql, new UserMapper());
	
	}

	

	@Override
	public void update(UserModel userModel) {
		String sql = "UPDATE users SET avatar= ? , username = ? , password = ? ,firstname = ?,lastname = ?,birthdate = ? ,address = ?, city =?, country =?, phone =? ,createbydate =?, status =?, role =?  WHERE id =?"; 
		  insert(sql,  userModel.getAvatar(), userModel.getUsername(), userModel.getPassword(), userModel.getFirstname(), userModel.getLastname()
					,userModel.getBirthdate(), userModel.getAddress(), userModel.getCity(), userModel.getCountry(), userModel.getPhone(), userModel.getCreatebydate(), userModel.getStatus(), userModel.getRole(), userModel.getId() );
	}

	@Override
	public void delete(int id) {
		System.out.println(id);
		String sql = "DELETE FROM users WHERE id = ?";
		update(sql, id);
		
	}
	@Override
	public UserModel findOne(Long id) {
		String sql = "SELECT * FROM users Where id = ?";
		List<UserModel> user =  query(sql, new UserMapper(), id);
		return user.isEmpty() ? null :  user.get(0);
	}
	@Override
	public Long save(UserModel userModel) {
		String sql  = "INSERT INTO users(avatar,username,password,firstname,lastname,birthdate,address,city,country,phone,createbydate,status,role) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
		return insert(sql, userModel.getAvatar(), userModel.getUsername(), userModel.getPassword(), userModel.getFirstname(), userModel.getLastname()
				,userModel.getBirthdate(), userModel.getAddress(),userModel.getCity(), userModel.getCountry(), userModel.getPhone(), userModel.getCreatebydate(), userModel.getStatus(), userModel.getRole());

	}

}
