package kr.springboot.springstudy.obejects.ocpexample;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MorningTheater implements Theater {

    @Override
    public boolean support(String type) {
        return "A".equals(type);
    }

    @Override
    public void pay() {

        System.out.println("13000원");

    }

}
