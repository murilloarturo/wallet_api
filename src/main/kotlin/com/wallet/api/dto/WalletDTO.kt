package com.wallet.api.dto

data class WalletDTO (
    val accountId: String,
    val iconURL: String,
    val amount: AmountDTO,
    val creditType: String,
    val datetime: String,
)

