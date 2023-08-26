package kr.springboot.springstudy.webclient;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
@Slf4j
@BankType(code = BankTypeCode.BANK)
public class HanaBankService implements BankService {

    private final BankWebClientModule hanaBankWebClientModule;

    @Override
    public void subscribeInquiry() {
        hanaBankWebClientModule.userConfirmation()
                .subscribe(userConfirmationResult -> {

                    log.info("#### HANA BANK USER CONFIRMATION SUCCESS ::: {} ####", userConfirmationResult);

                    hanaBankWebClientModule.inquiry()
                            .subscribe(inquiryResult -> {
                                log.info("#### HANA BANK INQUIRY SUCCESS ::: {} ####", inquiryResult);
                            });

                });
    }

    @Override
    public void blockInquiry() {

        String userConfirmationResult = hanaBankWebClientModule.userConfirmation().block();

        if (userConfirmationResult.equals("success")) {

            log.info("#### HANA BANK USER CONFIRMATION SUCCESS ::: {} ####", userConfirmationResult);

            String inquiryResult = hanaBankWebClientModule.inquiry().block();

            log.info("#### HANA BANK INQUIRY SUCCESS ::: {} ####", inquiryResult);

        }

    }

}
