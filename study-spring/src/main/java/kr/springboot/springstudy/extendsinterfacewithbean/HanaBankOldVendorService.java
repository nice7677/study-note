package kr.springboot.springstudy.extendsinterfacewithbean;

import org.springframework.stereotype.Service;

@Service
public class HanaBankOldVendorService implements HanaBankVendorService{

    @Override
    public boolean isSupport(String version) {
        return "old".equals(version);
    }

    @Override
    public String inquiry() {
        return "Hana Bank Old Service";
    }

}
