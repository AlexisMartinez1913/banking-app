package jagarcia.banking.app.service;

import jagarcia.banking.app.dto.AccountDto;
import jagarcia.banking.app.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(long id);
    AccountDto deposit(Long id, double amount);
    AccountDto withdraw(Long id, double amount);
    List<AccountDto> getAllAccounts();
    void deleteAccountById(long id);
}
