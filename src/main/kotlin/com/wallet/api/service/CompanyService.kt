package com.wallet.api.service

import com.wallet.api.entity.Company
import com.wallet.api.repository.CompanyRepository
import com.wallet.api.repository.WalletRepository
import org.springframework.stereotype.Service

@Service
class CompanyService(private val companyRepository: CompanyRepository,
                     private val walletRepository: WalletRepository,) {
    fun retrieveCompany(): Company {
        val company = companyRepository.findCompany()
        val wallets = walletRepository.findAll()
        company.wallets = wallets
        return company
    }
}