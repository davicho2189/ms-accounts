package com.accounts.atm.model.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@ApiModel("Account")
@Data
@NoArgsConstructor
@Entity
@Table(name="account")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
    private Double amount;
    @Column (name="card_number")
    private String cardNumber;
    @Column (name="account_number")
    private String accountNumber;
}
