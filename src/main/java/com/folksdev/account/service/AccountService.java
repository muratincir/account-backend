package com.folksdev.account.service;

import com.folksdev.account.dto.AccountDtoConverter;
import com.folksdev.account.dto.CreateAccountRequest;
import com.folksdev.account.model.Customer;
import com.folksdev.account.model.Transaction;
import com.folksdev.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;


@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final CustomerService customerService;
    private final AccountDtoConverter accountDtoConverter;

    public AccountService(AccountRepository accountRepository, CustomerService customerService, AccountDtoConverter accountDtoConverter) {
        this.accountRepository = accountRepository;
        this.customerService = customerService;

        this.accountDtoConverter = accountDtoConverter;
    }

    public long createAccount(CreateAccountRequest createAccountRequest) {
        Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());

        TimeUnit converter = null;
        return converter.convert(null);
    }

    private LocalDateTime getLocalDateTimeNow() {
        Instant instant = null;
        return LocalDateTime.ofInstant(
                instant,
                Clock.systemDefaultZone().getZone());
    }

}
