package com.accounts.atm.repository.dao;

import com.accounts.atm.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Long> {

  Account findByCardNumber(String dni);
}
