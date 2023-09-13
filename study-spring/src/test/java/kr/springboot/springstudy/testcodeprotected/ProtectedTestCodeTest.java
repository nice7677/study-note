package kr.springboot.springstudy.testcodeprotected;

import org.junit.jupiter.api.Test;

public class ProtectedTestCodeTest {

    @Test
    void printTest() {
        ProtectedTestCode protectedTestCode = new ProtectedTestCode();
        protectedTestCode.protectedMethod();
//        protectedTestCode.privateMethod();
//        테스트에서 호출이 불가함. protected는 가능함. 거기다 패키지 전역에서 쓸수있음.
    }

}
