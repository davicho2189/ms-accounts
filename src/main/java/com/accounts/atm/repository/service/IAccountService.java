package com.accounts.atm.repository.service;

import com.accounts.atm.model.dto.AccountResponse;
import io.reactivex.Single;

import java.util.List;

public interface IAccountService {

    public Single<List<AccountResponse>> findByDocument(String document) throws Exception;
}
