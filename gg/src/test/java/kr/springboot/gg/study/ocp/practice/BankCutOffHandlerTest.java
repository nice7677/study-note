package kr.springboot.gg.study.ocp.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@SpringBootTest
public class BankCutOffHandlerTest {

    @Autowired
    BankCutOffHandler bankCutOffHandler;

    @DisplayName("컷오프 테스트")
    @Test
    void getBankCutOff() {

        assertAll(
                () -> assertThat(bankCutOffHandler.getBankCutOff(Bank.WOORI)).isTrue(),
                () -> assertThat(bankCutOffHandler.getBankCutOff(Bank.SC)).isFalse(),
                () -> assertThat(bankCutOffHandler.getBankCutOff(Bank.HANA)).isTrue()
        );

    }

}
