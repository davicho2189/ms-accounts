package com.accounts.atm.repository.service;

import com.accounts.atm.model.dto.AccountResponse;
import com.accounts.atm.model.entity.Account;
import com.accounts.atm.repository.dao.AccountDao;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountService implements IAccountService {

  @Autowired
  private AccountDao accountDao;

  @Override
  public Single<AccountResponse> findByDocument(String document) throws Exception {

    Account account = accountDao.findByCardNumber(document);
    log.info("ola" + account.toString());
    AccountResponse accountResponse = new AccountResponse();
    BeanUtils.copyProperties(accountResponse, account);

    return Single.just(accountResponse).map(response -> {
      //Thread.sleep(5000);
      return accountResponse;
    }).subscribeOn(Schedulers.io());
  }

}
