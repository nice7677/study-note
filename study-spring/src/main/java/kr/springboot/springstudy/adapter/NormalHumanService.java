package kr.springboot.springstudy.adapter;

import org.springframework.stereotype.Service;

@Service
public class NormalHumanService implements HumanService {

    @Override
    public void walk() {
        System.out.println("앞으로 걷기");
    }

}
