package kr.springboot.pattern.abstractfactory;

public class IosBackPress implements BackPress{
    @Override
    public void back() {
        System.out.println("ios back press");
    }
}
