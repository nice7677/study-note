package kr.springboot.gg.study.ocp.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@RequiredArgsConstructor
@Component
public class BankCutOffHandler {

    private final Set<BankCutOff> bankCutOffs;

    public boolean getBankCutOff(Bank bank) {
        BankCutOff cutOff = bankCutOffs.stream()
                .filter(bankCutOff -> bankCutOff.isSameBank(bank))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("BAD REQUEST"));
        return cutOff.isCutOff();
    }

}
