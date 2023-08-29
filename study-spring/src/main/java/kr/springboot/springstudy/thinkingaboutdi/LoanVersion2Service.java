package kr.springboot.springstudy.thinkingaboutdi;


import kr.springboot.springstudy.transcation.LoanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoanVersion2Service implements LoanVersionService {

    private final LoanRepository loanRepository;

    public LoanVersion2Service(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @Override
    public void save() {
        log.info("### LoanVersion2Service save() ###");
    }

}
