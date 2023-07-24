package com.folksdev.account.dto

import com.folksdev.account.model.Account
import com.folksdev.account.model.Transaction
import org.springframework.stereotype.Component
import java.util.*
import java.util.stream.Collectors

@Component
class CustomerAccountDtoConverter(private val transactionDtoConverter: TransactionDtoConverter) {
    fun convert(from: Account): CustomerAccountDto {
        return CustomerAccountDto(
                Objects.requireNonNull(from.id)!!,
                from.balance,
                from.transaction
                        .stream()
                        .map { from: Transaction? -> transactionDtoConverter.convert(from) }
                        .collect(Collectors.toSet()),
                from.creationDate)
    }
}