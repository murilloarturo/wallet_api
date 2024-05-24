package com.wallet.api.dto

data class CompanyDTO (
    val name : String,
    val wallets: List<WalletDTO>,
)