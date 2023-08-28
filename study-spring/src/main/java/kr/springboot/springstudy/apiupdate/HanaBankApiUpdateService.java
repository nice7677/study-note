package kr.springboot.springstudy.apiupdate;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@RequiredArgsConstructor
@Service("hanaBankApiUpdateService")
public class HanaBankApiUpdateService {

    @Autowired
    @Qualifier("hanaBankV2WebClientModule")
    private BankWebClientModule bankWebClientModule;

    public String inquiry() {
        return bankWebClientModule.inquiry();
    }

}
