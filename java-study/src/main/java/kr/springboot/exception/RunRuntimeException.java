package kr.springboot.exception;

public class RunRuntimeException extends RuntimeException {

    public RunRuntimeException(Exception e) {
        super(e);
    }

}
