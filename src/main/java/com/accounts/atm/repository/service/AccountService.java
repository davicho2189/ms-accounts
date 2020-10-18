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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Service
public class AccountService implements IAccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Single<List<AccountResponse>> findByDocument(String document) throws Exception {

        List<Account> accounts =  accountDao
                .findByCardNumber(document);

        List<AccountResponse> responses = new ArrayList<>();
        for (Account account: accounts) {
            AccountResponse cardResponse = new AccountResponse();
            BeanUtils.copyProperties(cardResponse, account);
            responses.add(cardResponse);
        }

        responses.forEach(p->p.setAccountNumber(p.getAccountNumber().concat("xxxx")));
        return Single.just(responses).subscribeOn(Schedulers.io());
    }
}
