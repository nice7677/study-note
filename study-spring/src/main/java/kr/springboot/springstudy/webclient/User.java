package kr.springboot.springstudy.webclient;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {

    private final String name;

    private final String ci;

}
