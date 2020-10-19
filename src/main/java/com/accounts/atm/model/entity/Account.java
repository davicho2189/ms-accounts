package com.accounts.atm.model.entity;

import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



@ApiModel("Account")
@Data
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id")
  private Long id;
  private Double amount;
  @Column(name = "card_number")
  private String cardNumber;
  @Column(name = "account_number")
  private String accountNumber;
}
