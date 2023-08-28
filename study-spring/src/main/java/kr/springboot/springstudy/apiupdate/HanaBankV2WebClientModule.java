package kr.springboot.springstudy.apiupdate;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component("hanaBankV2WebClientModule")
public class HanaBankV2WebClientModule implements HanaBankWebClientModule {

    @Override
    public String inquiry() {
        return WebClient.builder()
                .baseUrl("http://localhost:8081/api/loans/version/hana/v2/inquiry")
                .build()
                .get()
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
