package com.wallet.api.repository

import com.wallet.api.entity.Amount
import com.wallet.api.entity.CreditType
import com.wallet.api.entity.Wallet
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

@Service
class WalletRepository {
    fun findAll(): List<Wallet> {
        return listOf(
            Wallet(
                accountId = UUID.randomUUID(),
                iconURL = "https://www.countryflags.com/wp-content/uploads/united-states-of-america-flag-png-large.png",
                amount = Amount(
                    amount = BigDecimal(198_395.3700),
                    currency = Currency.getInstance("USD")
                ),
                creditType = CreditType.credit,
                datetime = LocalDate.of(2023, 2, 24),
            ),
            Wallet(
                accountId = UUID.randomUUID(),
                iconURL = "https://www.countryflags.com/wp-content/uploads/europe-flag-jpg-xl.jpg",
                amount = Amount(
                    amount = BigDecimal(2_608.1200),
                    currency = Currency.getInstance("EUR")
                ),
                creditType = CreditType.debit,
                datetime = LocalDate.of(2024, 1, 12),
            ),
            Wallet(
                accountId = UUID.randomUUID(),
                iconURL = "https://www.countryflags.com/wp-content/uploads/united-kingdom-flag-png-large.png",
                amount = Amount(
                    amount = BigDecimal(255_000.0000),
                    currency = Currency.getInstance("GBP")
                ),
                creditType = CreditType.credit,
                datetime = LocalDate.of(2022, 10, 1),
            ),
            Wallet(
                accountId = UUID.randomUUID(),
                iconURL = "https://www.countryflags.com/wp-content/uploads/venezuela-flag-png-large.png",
                amount = Amount(
                    amount = BigDecimal(0.0001),
                    currency = Currency.getInstance("VEF")
                ),
                creditType = CreditType.debit,
                datetime = LocalDate.of(1990, 12, 26),
            ),
            Wallet(
                accountId = UUID.randomUUID(),
                iconURL = "https://www.countryflags.com/wp-content/uploads/colombia-flag-png-large.png",
                amount = Amount(
                    amount = BigDecimal(450_000_000.0000),
                    currency = Currency.getInstance("COP")
                ),
                creditType = CreditType.debit,
                datetime = LocalDate.of(2015, 4, 17),
            ),
            Wallet(
                accountId = UUID.randomUUID(),
                iconURL = "https://www.countryflags.com/wp-content/uploads/south-korea-flag-png-large.png",
                amount = Amount(
                    amount = BigDecimal(74_103_430.0100),
                    currency = Currency.getInstance("KRW")
                ),
                creditType = CreditType.debit,
                datetime = LocalDate.of(2017, 4, 17),
            ),
            Wallet(
                accountId = UUID.randomUUID(),
                iconURL = "https://www.countryflags.com/wp-content/uploads/japan-flag-png-large.png",
                amount = Amount(
                    amount = BigDecimal(8_512_087.1600),
                    currency = Currency.getInstance("JPY")
                ),
                creditType = CreditType.debit,
                datetime = LocalDate.of(2018, 4, 17),
            ),
        )
    }
}
