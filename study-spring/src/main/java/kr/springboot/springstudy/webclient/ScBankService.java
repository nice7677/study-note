package kr.springboot.springstudy.webclient;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@RequiredArgsConstructor
@Service
@Slf4j
public class ScBankService implements BankService {

    private final BankWebClientModule scBankWebClientModule;

    @Override
    public void subscribeInquiry() {
        scBankWebClientModule.userConfirmation()
                .subscribe(userConfirmationResult -> {

                    log.info("#### SC BANK USER CONFIRMATION SUCCESS ::: {} ####", userConfirmationResult);

                    scBankWebClientModule.inquiry()
                            .subscribe(inquiryResult -> {
                                log.info("#### SC BANK INQUIRY SUCCESS ::: {} ####", inquiryResult);
                            }, exceptionHandler);

                }, exceptionHandler);
    }

    @Override
    public void blockInquiry() {

        String userConfirmationResult = scBankWebClientModule.userConfirmation().block();

        if (userConfirmationResult.equals("success")) {

            log.info("#### SC BANK USER CONFIRMATION SUCCESS ::: {} ####", userConfirmationResult);

            String inquiryResult = scBankWebClientModule.inquiry().block();

            log.info("#### SC BANK INQUIRY SUCCESS ::: {} ####", inquiryResult);

        }

    }

}
