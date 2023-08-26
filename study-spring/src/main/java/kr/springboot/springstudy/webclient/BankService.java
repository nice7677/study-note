package kr.springboot.springstudy.webclient;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public interface BankService {

    static final Logger log = LoggerFactory.getLogger(BankService.class);

    Consumer<Throwable> exceptionHandler = error -> {
        log.error("#### ERROR ::: {} ####", error.getMessage());
    };

    void subscribeInquiry();

    void blockInquiry();

}
