package kr.springboot.pattern.abstractfactory;

public class AndroidBackPress implements BackPress{
    @Override
    public void back() {
        System.out.println("android back press");
    }
}
