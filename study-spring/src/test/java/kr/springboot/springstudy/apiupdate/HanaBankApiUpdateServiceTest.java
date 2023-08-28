package kr.springboot.springstudy.apiupdate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HanaBankApiUpdateServiceTest {

    @Autowired
    HanaBankApiUpdateService hanaBankApiUpdateService;

    @Test
    void inquiry() {
        assertThat(hanaBankApiUpdateService.inquiry()).isEqualTo("version2");
    }

}
