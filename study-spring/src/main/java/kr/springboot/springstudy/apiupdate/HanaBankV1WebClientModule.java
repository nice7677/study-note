package kr.springboot.springstudy.apiupdate;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component("hanaBankV1WebClientModule")
public class HanaBankV1WebClientModule implements BankWebClientModule {

    @Override
    public String inquiry() {
        return WebClient.builder()
                .baseUrl("http://localhost:8081/api/loans/version/hana/v1/inquiry")
                .build()
                .get()
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
