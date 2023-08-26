package kr.springboot.springstudy.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class LoanService {

    private final Set<BankService> bankServices;

    public void subscribeInquiry() {
        bankServices.stream()
                .sorted(Comparator.comparing(bankService -> bankService.getClass().getAnnotation(BankType.class).code().getSort()))
                .forEach(BankService::subscribeInquiry);
    }

    public void blockInquiry() {
        bankServices.stream()
                .sorted(Comparator.comparing(bankService -> bankService.getClass().getAnnotation(BankType.class).code().getSort()))
                .forEach(BankService::blockInquiry);
    }

}
