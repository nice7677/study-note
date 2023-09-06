package kr.springboot.springstudy.webclient;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Webclient Module 테스트를 WireMockServer로 변경하는 테스트")
@SpringBootTest
public class WireMockServerTest {

    private static WireMockServer wireMockServer;

    @Autowired
    BankWebClientModule jinWooBankWebClientModule;

    @Nested
    @DisplayName("jiwnooBankWebClientModule을")
    class Describe_jiwnoo_bank_web_client_module {


        @Nested
        @DisplayName("wire mock server로 변경하면")
        class Context_with_wire_mock_server {

            @BeforeEach
            void setUp() {
                wireMockServer = new WireMockServer(8081);
                wireMockServer.start();
            }

            @AfterEach
            void tearDown() {
                wireMockServer.stop();
            }


            @Test
            @DisplayName("success를 리턴한다.")
            void valid() {

                wireMockServer.stubFor(
                        get(urlEqualTo("/api/loans/jinwoo"))
                                .willReturn(ok("success"))
                );
                String url = jinWooBankWebClientModule.userConfirmation().block();
                assertThat(url).isEqualTo("success");

            }

        }

    }

}
