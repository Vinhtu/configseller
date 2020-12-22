package Service;

import java.util.List;

import Model.AccountModel;

public interface IAccountService {
    AccountModel findByAccountStatus(String username, String password);
    AccountModel addAccount(AccountModel accountModel);
    List<AccountModel> getAccountAll();
    
}
