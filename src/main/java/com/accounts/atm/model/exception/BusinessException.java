package com.cards.atm.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No se encuentra dni")
public class BusinessException extends Exception{

    public BusinessException(){};

}