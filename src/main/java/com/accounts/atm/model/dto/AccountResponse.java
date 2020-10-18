package com.accounts.atm.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.Column;

@ApiModel("AccountResponse")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountResponse {

    private Double amount;
    private String accountNumber;

}
