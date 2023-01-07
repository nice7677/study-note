package kr.springboot.pattern.cor;

public class UserExistsMiddleware extends Middleware{

    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("가입 한적이 없음.");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("비밀번호 틀림");
            return false;
        }
        return checkNext(email, password);
    }
}
