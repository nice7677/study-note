package kr.springboot.springstudy.thinkingaboutdi;

import kr.springboot.springstudy.transcation.LoanRepository;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final LoanRepository loanRepository;
    private final LoanVersionService loanVersion1Service;
    private final LoanVersionService loanVersion2Service;

    public LoanService(LoanRepository loanRepository, LoanVersionService loanVersion1Service, LoanVersionService loanVersion2Service) {
        this.loanRepository = loanRepository;
        this.loanVersion1Service = loanVersion1Service;
        this.loanVersion2Service = loanVersion2Service;
    }

    public void rouseToActivity() {

        String name = loanRepository.findByName("loan").getName();

        if (name.equals("test")) {

            loanVersion1Service.save();

            return;

        }

        loanVersion2Service.save();

    }

}
