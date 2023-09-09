package kr.springboot.springstudy.ocp.practice2;

public class Puzzle {

    private final HorizontalPosition horizontalPosition;
    private final VerticalPosition verticalPosition;

    public Puzzle(HorizontalPosition horizontalPosition, VerticalPosition verticalPosition) {
        this.horizontalPosition = horizontalPosition;
        this.verticalPosition = verticalPosition;
    }

    public void move(HorizontalInput input) {

        horizontalPosition.move(input);

    }

    public void move(VerticalInput input) {

        verticalPosition.move(input);

    }

    public HorizontalPosition getHorizontalPosition() {
        return horizontalPosition;
    }

    public VerticalPosition getVerticalPosition() {
        return verticalPosition;
    }

}
