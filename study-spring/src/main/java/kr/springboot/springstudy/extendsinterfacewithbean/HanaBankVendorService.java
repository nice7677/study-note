package kr.springboot.springstudy.extendsinterfacewithbean;

public interface HanaBankVendorService extends VendorService{

    boolean isSupport(String bankCode);

}
