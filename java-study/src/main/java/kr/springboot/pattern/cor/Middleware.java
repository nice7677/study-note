package kr.springboot.pattern.cor;

public abstract class Middleware {

    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {

        Middleware head = first;

        for (Middleware nexInChain : chain) {
            head.next = nexInChain;
            head = nexInChain;
        }

        return first;

    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {

        if (next == null) return true;

        return next.check(email, password);

    }

}
