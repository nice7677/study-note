package kr.springboot.springstudy.replicationtransaction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TransferServiceTest {

    @Autowired
    TransferService transferService;

    @BeforeEach
    void setUp() {
        transferService.save(User.builder()
                .name("진우")
                .balance(20000D)
                .build());
        transferService.save(User.builder()
                .name("우진")
                .balance(15000D)
                .build());
    }

    @Test
    void transfer() {
        transferService.transfer("진우", "우진", 1000.0);
        assertThat(transferService.findByUserName("진우").getBalance()).isEqualTo(19000D);
        assertThat(transferService.findByUserName("우진").getBalance()).isEqualTo(15000D);
    }

}
