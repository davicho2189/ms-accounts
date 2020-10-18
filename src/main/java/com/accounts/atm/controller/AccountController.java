package com.accounts.atm.controller;

import com.accounts.atm.model.dto.AccountResponse;
import com.accounts.atm.repository.service.IAccountService;
import io.reactivex.Single;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Account microservicio" )
@Slf4j
@RestController
@RequestMapping("core")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @ApiOperation(value = "Obtener las cuentas", response = AccountResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success OK"),
            @ApiResponse(code = 404, message = "No se tarjetas")})
    @GetMapping("/accounts/{cardNumber}")
    public Single<List<AccountResponse>> GetAccounts(
            @PathVariable String cardNumber
    ) throws Exception {
            return accountService.findByDocument(cardNumber);
    }

}
