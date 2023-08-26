package kr.springboot.springstudy.webclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LoanServiceTest {

    @Autowired
    LoanService loanService;

    @Test
    void subscribeInquiry() {

        boolean error = false;

        try {
            loanService.subscribeInquiry();
        } catch (Exception e) {
            error = true;
        }

        assertThat(error).isFalse();
    }

    @Test
    void blockInquiry() {

        boolean error = false;

        try {
            loanService.blockInquiry();
        } catch (Exception e) {
            error = true;
        }

        assertThat(error).isTrue();

    }

}
