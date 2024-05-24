package com.wallet.api.entity

data class Company (
    var name: String,
    var wallets: List<Wallet>
)