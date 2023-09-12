package kr.springboot.pattern.abstractfactory;

public class IosButton implements Button {

    @Override
    public void click() {
        System.out.println("ios button click");
    }

}
