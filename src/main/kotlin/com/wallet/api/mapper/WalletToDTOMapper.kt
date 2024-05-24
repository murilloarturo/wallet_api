package com.wallet.api.mapper

import com.wallet.api.dto.WalletDTO
import com.wallet.api.entity.Wallet
import java.time.format.DateTimeFormatter

class WalletToDTOMapper {
    private val amountMapper = AmountToDTOMapper()
    private val creditTypeMapper = CreditTypeToDTOMapper()

    fun map(wallet: Wallet): WalletDTO {
        val formatter = DateTimeFormatter.ISO_LOCAL_DATE
        return WalletDTO(accountId = wallet.accountId.toString(),
            iconURL = wallet.iconURL,
            amount = amountMapper.map(wallet.amount),
            creditType = creditTypeMapper.map(wallet.creditType),
            datetime = formatter.format(wallet.datetime)
        )
    }
}