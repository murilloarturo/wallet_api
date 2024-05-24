package com.wallet.api.dto

import java.math.BigDecimal

data class AmountDTO (
    val amount: BigDecimal,
    val currency: String,
)