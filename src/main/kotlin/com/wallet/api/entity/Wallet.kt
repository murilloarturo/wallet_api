package com.wallet.api.entity

import java.time.LocalDate
import java.util.UUID

data class Wallet (
    val accountId: UUID,
    val iconURL: String,
    val amount: Amount,
    val creditType: CreditType,
    val datetime: LocalDate,
)