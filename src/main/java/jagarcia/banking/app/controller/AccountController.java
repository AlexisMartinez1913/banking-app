package jagarcia.banking.app.controller;

import jagarcia.banking.app.dto.AccountDto;
import jagarcia.banking.app.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
