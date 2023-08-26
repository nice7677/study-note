package kr.springboot.springstudy.webclient;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BankTypeCode {

    BANK(1),
    SAVING_BANK(2),

    ;

    private final int sort;

}
