package kr.springboot.springstudy.obejects.ocpexample;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class NightTheater implements Theater{

    @Override
    public boolean support(String type) {
        return "B".equals(type);
    }

    @Override
    public void pay() {

        System.out.println("20000원");

    }

}
