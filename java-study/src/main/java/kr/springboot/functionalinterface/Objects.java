package kr.springboot.functionalinterface;

public class Objects implements Book {

    @Override
    public void read() {
        System.out.println("오브젝트를 읽는다.");
    }

}
