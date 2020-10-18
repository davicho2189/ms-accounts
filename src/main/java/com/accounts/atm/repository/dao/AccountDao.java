package com.accounts.atm.repository.dao;

import com.accounts.atm.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDao extends JpaRepository<Account, Long> {

    List<Account> findByCardNumber(String dni);
}
