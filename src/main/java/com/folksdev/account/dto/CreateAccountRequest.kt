package com.folksdev.account.dto

import org.jetbrains.annotations.NotNull
import java.math.BigDecimal

data class CreateAccountRequest(
        val customerId:String,
        val initialCredit: BigDecimal
)
