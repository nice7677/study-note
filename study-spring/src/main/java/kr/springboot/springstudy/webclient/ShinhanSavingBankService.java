package kr.springboot.springstudy.webclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@BankType(code = BankTypeCode.SAVING_BANK)
public class ShinhanSavingBankService implements BankService{

    @Override
    public void subscribeInquiry() {
      log.info("신한저축은행 조회");
    }

    @Override
    public void blockInquiry() {
        log.info("신한저축은행 조회");
    }

}
