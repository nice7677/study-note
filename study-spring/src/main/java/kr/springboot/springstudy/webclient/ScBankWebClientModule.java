package kr.springboot.springstudy.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class ScBankWebClientModule implements BankWebClientModule{

    private final WebClient scBankWebClient;

    @Override
    public Mono<String> userConfirmation() {
        return scBankWebClient.post()
                .uri("/userConfirmation")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(
                        User.builder()
                                .name("이진우")
                                .ci("ASD()*)#JD*&DFDKJCNDLKl##==")
                                .build()
                ))
                .retrieve()
                .bodyToMono(String.class)
                .log();
    }

    @Override
    public Mono<String> inquiry() {
        return scBankWebClient.post()
                .uri("/inquiry")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(
                        User.builder()
                                .name("이진우")
                                .ci("ASD()*)#JD*&DFDKJCNDLKl##==")
                                .build()
                ))
                .retrieve()
                .bodyToMono(String.class)
                .log();
    }

    @Override
    public Mono<String> request() {
        return scBankWebClient.post()
                .uri("/inquiry")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(
                        User.builder()
                                .name("이진우")
                                .ci("ASD()*)#JD*&DFDKJCNDLKl##==")
                                .build()
                ))
                .retrieve()
                .bodyToMono(String.class)
                .log();
    }

    @Override
    public Mono<String> cancel() {
        return scBankWebClient.post()
                .uri("/cancel")
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(
                        User.builder()
                                .name("이진우")
                                .ci("ASD()*)#JD*&DFDKJCNDLKl##==")
                                .build()
                ))
                .retrieve()
                .bodyToMono(String.class)
                .log();
    }

}
