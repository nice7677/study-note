package kr.springboot.springstudy.webclient;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class JinWooBankWebClientModule implements BankWebClientModule{

    private final WebClient jinwooWebClient;

    public JinWooBankWebClientModule(WebClient jinwooWebClient) {
        this.jinwooWebClient = jinwooWebClient;
    }

    @Override
    public Mono<String> userConfirmation() {
        return jinwooWebClient.get()
                .retrieve()
                .bodyToMono(String.class);
    }

    @Override
    public Mono<String> inquiry() {
        return null;
    }

    @Override
    public Mono<String> request() {
        return null;
    }

    @Override
    public Mono<String> cancel() {
        return null;
    }
}
