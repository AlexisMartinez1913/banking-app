package jagarcia.banking.app.service;

import jagarcia.banking.app.dto.AccountDto;
import jagarcia.banking.app.entity.Account;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
}
