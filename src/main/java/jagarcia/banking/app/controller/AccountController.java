package jagarcia.banking.app.controller;

import jagarcia.banking.app.dto.AccountDto;
import jagarcia.banking.app.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
@AllArgsConstructor
public class AccountController {
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }
    //Get Account Rest API
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable long id) {
        AccountDto accountDto = accountService.getAccountById(id);
        //return new ResponseEntity<>(accountDto, HttpStatus.OK);
        return ResponseEntity.ok(accountDto);
    }

    //Deposit REST API
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
                                              @RequestBody Map<String, Double> request) {
        Double amount = request.get("amount");
        AccountDto accountDto = accountService.deposit(id, amount);

        return ResponseEntity.ok(accountDto);
    }

    //Withdraw REST API
    @PutMapping("/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,
                                               @RequestBody Map<String, Double> request) {
        double amount = request.get("amount");
        AccountDto accountDto = accountService.withdraw(id, amount);
        return ResponseEntity.ok(accountDto);
    }
    //Get All Accounts REST API
    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<AccountDto> accounts = accountService.getAllAccounts();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable long id) {
        accountService.deleteAccountById(id);
        return new ResponseEntity<>("Account is Deleted successfully!", HttpStatus.OK);
    }
}
