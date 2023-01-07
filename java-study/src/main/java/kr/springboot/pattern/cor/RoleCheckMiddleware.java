package kr.springboot.pattern.cor;

public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("nice7677@naver.com")) {
            System.out.println("하이 진우");
            return true;
        }
        System.out.println("하이 유저");
        return checkNext(email, password);
    }
}
