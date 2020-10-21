package com.accounts.atm.repository.service;


import com.accounts.atm.model.dto.AccountResponse;
import io.reactivex.Single;


public interface IAccountService {

  public Single<AccountResponse> findByDocument(String document) throws Exception;
}
