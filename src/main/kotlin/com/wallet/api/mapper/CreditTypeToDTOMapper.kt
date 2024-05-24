package com.wallet.api.mapper

import com.wallet.api.entity.CreditType

class CreditTypeToDTOMapper {
    fun map(creditType: CreditType): String {
        return when (creditType) {
            CreditType.credit -> "credit"
            CreditType.debit -> "debit"
        }
    }
}