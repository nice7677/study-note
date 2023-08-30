package kr.springboot.springstudy.extendsinterfacewithbean;

public class HanaBankNewVendorService implements HanaBankVendorService{

    @Override
    public boolean isSupport(String bankCode) {
        return "new".equals(bankCode);
    }

    @Override
    public String inquiry() {
        return "Hana Bank New Service";
    }

}
