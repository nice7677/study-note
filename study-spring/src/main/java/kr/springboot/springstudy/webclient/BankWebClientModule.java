package kr.springboot.springstudy.webclient;

import reactor.core.publisher.Mono;

public interface BankWebClientModule {

    Mono<String> userConfirmation();

    Mono<String> inquiry();

    Mono<String> request();

    Mono<String> cancel();

}
