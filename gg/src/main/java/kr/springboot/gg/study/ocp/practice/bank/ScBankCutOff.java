package kr.springboot.gg.study.ocp.practice.bank;

import kr.springboot.gg.study.ocp.practice.Bank;
import kr.springboot.gg.study.ocp.practice.BankCutOff;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ScBankCutOff implements BankCutOff {

    @Override
    public boolean isSameBank(Bank bank) {
        return bank == Bank.SC;
    }

    @Override
    public boolean isCutOff() {
        log.info("제일 은행 컷오프 실행");
        return false;
    }

}
