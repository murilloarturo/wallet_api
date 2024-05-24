package com.wallet.api.mapper

import com.wallet.api.dto.AmountDTO
import com.wallet.api.entity.Amount
import java.math.RoundingMode

class AmountToDTOMapper {
    fun map(amount: Amount): AmountDTO {
        return AmountDTO(
            amount = amount.amount.setScale(4, RoundingMode.HALF_EVEN),
            currency = amount.currency.currencyCode
        )
    }
}