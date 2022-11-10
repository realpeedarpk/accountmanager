package com.peedarpk.accountmanager.Account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class AccountConfig {

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository repository) {
        return args -> {
            Account acc1 = new Account("Expense", new BigDecimal(500.00), "worth it", "Food", LocalDate.of(2022, Month.NOVEMBER, 10), "CASH");

            Account acc2 = new Account("Income", new BigDecimal(1500.00), "interest", "Income", LocalDate.of(2022, Month.NOVEMBER, 10), "CASH");

            repository.saveAll(List.of(acc1, acc2));
        };
    }
}
