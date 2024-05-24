package com.wallet.api.mapper

import com.wallet.api.dto.CompanyDTO
import com.wallet.api.entity.Company

class CompanyToDTOMapper {
    private val walletMapper = WalletToDTOMapper()

    fun map(company: Company): CompanyDTO {
        return CompanyDTO(
            name = company.name,
            wallets = company.wallets.map { walletMapper.map(it) }
        )
    }
}