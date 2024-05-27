package com.wallet.api.controller

import com.wallet.api.dto.CompanyDTO
import com.wallet.api.entity.Company
import com.wallet.api.mapper.CompanyToDTOMapper
import com.wallet.api.repository.WalletRepository
import com.wallet.api.service.CompanyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class WalletController(val companyService: CompanyService) {
    private val companyMapper = CompanyToDTOMapper()

    @GetMapping("/company")
    fun retrieveCompany() : CompanyDTO {
        Thread.sleep(3000)
        val company = companyService.retrieveCompany()
        return companyMapper.map(company)
    }
}