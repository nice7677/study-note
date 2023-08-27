package kr.springboot.springstudy.webclient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class WebClientMockTest {

    @Mock
    BankWebClientModule jinWooBankWebClientModule;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Mockito 를 사용한 외부 호출 테스트
     */
    @Test
    void scBankTest() {

        when(jinWooBankWebClientModule.userConfirmation())
                .thenReturn(Mono.just("success"));

        assertThat(jinWooBankWebClientModule.userConfirmation().block()).isEqualTo("success");

    }

}
