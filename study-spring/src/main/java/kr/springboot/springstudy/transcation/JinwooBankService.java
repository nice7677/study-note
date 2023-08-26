package kr.springboot.springstudy.transcation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Slf4j
@Service
public class JinwooBankService {

    private final LoanRepository loanRepository;

    public void requestLoanInquiry() {

        try {
            inquiry();
            saveNew();
        } catch (Exception e) {
            log.error("ERROR ::: {}", e.getMessage());
        }

    }

    private void inquiry() {

        WebClient requestLoanInquiry = WebClient.builder()
                .baseUrl("http://127.0.0.1:8081/api/loans")
                .build();

        requestLoanInquiry
                .post()
                .retrieve()
                .bodyToMono(Object.class)
                .block();

    }

    @Transactional
    public void saveNew() {

        Loan newLoan = loanRepository.findByName("Jinwoo");

        newLoan.setTx("changeSave");

        loanRepository.save(newLoan);

    }


}
