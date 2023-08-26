package kr.springboot.springstudy.webclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Configuration
public class WebClientConfig {

    @Bean
    public WebClient hanaBankWebClient() {
        return WebClient.builder()
                .filter(logRequest())
                .baseUrl("http://localhost:8081/api/loans/hana")
                .build();
    }

    @Bean
    public WebClient scBankWebClient() {
        return WebClient.builder()
                .filter(logRequest())
                .baseUrl("http://localhost:8081/api/loans/sc")
                .build();
    }

    private ExchangeFilterFunction logRequest() {
        return ExchangeFilterFunction.ofRequestProcessor(request -> {
            log.info("Request: {} {}", request.method(), request.url());
            request.headers().forEach((key, value) -> log.debug("{}: {}", key, value));
            return Mono.just(request);
        });
    }

}
