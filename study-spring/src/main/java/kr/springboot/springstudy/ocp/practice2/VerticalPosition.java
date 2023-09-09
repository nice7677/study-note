package kr.springboot.springstudy.ocp.practice2;

public class VerticalPosition {

    private int value = 0;

    public void move(VerticalInput input) {
        int currentPosition = value;
        int newPosition = currentPosition + input.handle();
        value = newPosition;
    }

    public int getValue() {
        return value;
    }

}
