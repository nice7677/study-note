package kr.springboot.springstudy.extendsinterfacewithbean;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class HanaBankVendorHandler {

    private final Set<HanaBankVendorService> hanaBankVendorServices;

    public HanaBankVendorHandler(Set<HanaBankVendorService> hanaBankVendorServices) {
        this.hanaBankVendorServices = hanaBankVendorServices;
    }

    public String inquiry(String version) {
        return hanaBankVendorServices.stream()
                .filter(hanaBankVendorService -> hanaBankVendorService.isSupport(version))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not supported version"))
                .inquiry();
    }

}
