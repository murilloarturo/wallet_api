package com.wallet.api.entity

import java.math.BigDecimal
import java.util.Currency

data class Amount (
    val amount: BigDecimal,
    val currency: Currency
)