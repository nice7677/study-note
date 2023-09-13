package kr.springboot.exception;

public class Human {

    private final Run run;

    public Human(Run run) {
        this.run = run;
    }

    public void run() {
        try {
            run.run();
        } catch (Exception e) {
            throw new RunRuntimeException(e);
        }
    }

}
