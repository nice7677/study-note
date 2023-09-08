package kr.springboot.springstudy.adapter;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class Adapter implements HumanServiceAdapter {

    private final Set<HumanService> humanService;

    public Adapter(Set<HumanService> humanService) {
        this.humanService = humanService;
    }

    @Override
    public void walk() {

    }

}
