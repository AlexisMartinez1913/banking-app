package jagarcia.banking.app.service.impl;

import jagarcia.banking.app.dto.AccountDto;
import jagarcia.banking.app.entity.Account;
import jagarcia.banking.app.mapper.AccountMapper;
import jagarcia.banking.app.repository.AccountRepository;
import jagarcia.banking.app.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(long id) {
        Account account = accountRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Account not found"));
        return AccountMapper.mapToAccountDto(account);
    }
}
