package com.folksdev.account.dto;

import com.folksdev.account.model.Customer;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CustomerDtoConverter {
    private final CustomerAccountDtoConverter customerAccountDtoConverter;

    public CustomerDtoConverter(CustomerAccountDtoConverter converter) {
        this.customerAccountDtoConverter = converter;
    }
    public AccountCustomerDto convertToAccountCustomer(Customer from){
        if(from == null){
            return new AccountCustomerDto("","","");
        }
        return new AccountCustomerDto(from.getId(), from.getName(), from.getSurname());
    }

    public CustomerDto convertToCustomerDto(Customer from) {
        Object customerAccountDtoConverter = null;
        return null;

    }
}
