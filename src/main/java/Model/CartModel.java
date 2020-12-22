package Model;

public class CartModel {
	
	
	private int id;
	private AccountModel account;
	private int u_id;
	private String buyDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AccountModel getUser() {
		return account;
	}
	public void setAccount(AccountModel account) {
		this.account = account;
	}

 	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

}
