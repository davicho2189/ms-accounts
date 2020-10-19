package com.accounts.atm.repository.dao;

import com.accounts.atm.model.entity.Account;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account, Long> {

  List<Account> findByCardNumber(String dni);
}
