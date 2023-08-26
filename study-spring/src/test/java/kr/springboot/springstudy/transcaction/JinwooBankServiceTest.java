package kr.springboot.springstudy.transcaction;

import kr.springboot.springstudy.transcation.JinwooBankService;
import kr.springboot.springstudy.transcation.Loan;
import kr.springboot.springstudy.transcation.LoanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class JinwooBankServiceTest {

    @Autowired
    private JinwooBankService jinwooBankService;

    @Autowired
    private LoanRepository loanRepository;

    @Test
    void transactionTest() {

        loanRepository.saveAndFlush(Loan.builder()
                .name("Jinwoo")
                .tx("save")
                .build());

        jinwooBankService.requestLoanInquiry();

        Loan loan = loanRepository.findByName("Jinwoo");

        assertThat(loan.getTx()).isEqualTo("save");

    }

}
