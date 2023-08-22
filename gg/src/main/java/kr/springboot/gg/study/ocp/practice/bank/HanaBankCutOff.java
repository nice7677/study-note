package kr.springboot.gg.study.ocp.practice.bank;

import kr.springboot.gg.study.ocp.practice.Bank;
import kr.springboot.gg.study.ocp.practice.BankCutOff;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HanaBankCutOff implements BankCutOff {

    private static final String BANK_NAME = "HANA_BANK";

    @Override
    public boolean isSameBank(Bank bank) {
        return bank == Bank.HANA;
    }

    @Override
    public boolean isCutOff() {
        log.info("하나 은행 컷오프 실행");
        return true;
    }

}
