package kr.springboot.springstudy.extendsinterfacewithbean;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HanaBankService implements VendorService{

    private final HanaBankVendorHandler hanaBankVendorHandler;

    public HanaBankService(HanaBankVendorHandler hanaBankVendorHandler) {
        this.hanaBankVendorHandler = hanaBankVendorHandler;
    }

    @Override
    public String inquiry() {
        String version = Optional.of("old").orElse("new");
        return hanaBankVendorHandler.inquiry(version);
    }

}
