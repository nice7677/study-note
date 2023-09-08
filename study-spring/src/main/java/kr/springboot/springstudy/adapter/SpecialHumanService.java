package kr.springboot.springstudy.adapter;

import org.springframework.stereotype.Service;

@Service
public class SpecialHumanService implements HumanService{

    @Override
    public void walk() {
        System.out.println("뒤로 걷기");
    }

}
