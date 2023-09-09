package kr.springboot.springstudy.obejects.ocpexample;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TestService {

    private final Set<Theater> theaters;

    public TestService(Set<Theater> theaters) {
        this.theaters = theaters;
    }

    public void pay(String type) {
        theaters.stream().filter(theater -> theater.support(type)).findFirst().ifPresent(Theater::pay);
    }

}
