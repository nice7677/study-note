package kr.springboot.springstudy.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class HanaBankWebClientModule implements BankWebClientModule {

    private final WebClient hanaBankWebClient;

    @Override
    public Mono<String> userConfirmation() {
        return hanaBankWebClient.post()
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
        return hanaBankWebClient.post()
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
        return hanaBankWebClient.post()
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
        return hanaBankWebClient.post()
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
