package kr.springboot.springstudy.webclient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WebClientTest {

    @Autowired
    BankService scBankService;

    @Qualifier("hanaBankService2")
    @Autowired
    BankService hanaBankService;

    /**
     * 테스트 목적 WebClient Subscribe Throwable Handler 사용
     * 그리고 Block 구문사용시 에러 발생 시 다음 구문 진행 여부
     * scBankService inquiry에 400을 만들었음. // MockScApiController
     */
    @DisplayName("Subscribe 테스트")
    @Test
    void subscribe() {

        scBankService.subscribeInquiry();
        hanaBankService.subscribeInquiry();

    }

    @DisplayName("Block 테스트")
    @Test
    void block() {

        scBankService.blockInquiry();
        hanaBankService.blockInquiry();

    }

}
