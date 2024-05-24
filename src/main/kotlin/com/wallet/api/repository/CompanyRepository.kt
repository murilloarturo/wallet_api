package com.wallet.api.repository

import com.wallet.api.entity.Company
import org.springframework.stereotype.Service

@Service
class CompanyRepository() {
    fun findCompany(): Company {
        return Company(name = "Murillo's Inc.", wallets = listOf())
    }
}