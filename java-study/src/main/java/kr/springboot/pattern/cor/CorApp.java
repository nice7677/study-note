package kr.springboot.pattern.cor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Cor
 * Chain Of Responsibility
 */
public class CorApp {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {

        server = new Server();
        server.register("nice7677@naver.com", "heleleo");
        server.register("poooo@ggg.com", "gg");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);

    }

    public static void main(String[] args) throws IOException {

        init();

        boolean success;
        do {
            System.out.println("이메일 : ");
            String email = reader.readLine();
            System.out.println("비밀번호 : ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);

    }

}
