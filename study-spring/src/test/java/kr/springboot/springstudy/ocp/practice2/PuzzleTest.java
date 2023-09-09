package kr.springboot.springstudy.ocp.practice2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("퍼즐 클래스")
public class PuzzleTest {

    Left left = new Left();
    Right right = new Right();
    Up up = new Up();
    Down down = new Down();

    Puzzle puzzle = new Puzzle(new HorizontalPosition(), new VerticalPosition());

    @Nested
    @DisplayName("HorizontalInput을 받는 move 메소드는")
    class Describe_horizontal_input_move {


        @Nested
        @DisplayName("Left를 받으면")
        class Context_with_get_left {

            @Test
            @DisplayName("0인 위치에서 -1로 변경 된다.")
            void it_prints_move_left() {

                puzzle.move(left);

                assertThat(puzzle.getHorizontalPosition().getValue()).isEqualTo(-1);

            }

        }

        @Nested
        @DisplayName("ㅇRight를 3번 받으면")
        class Context_with_get_right_three_times {

            @Test
            @DisplayName("0인 위치에서 3으로 변경 된다.")
            void it_prints_move_right_three_times() {

                for (int i = 0; i < 3; i++) {
                    puzzle.move(right);
                }

                assertThat(puzzle.getHorizontalPosition().getValue()).isEqualTo(3);

            }

        }

    }

    @Nested
    @DisplayName("VerticalInput을 받는 move 메소드는")
    class Describe_vertical_input_move {

        @Nested
        @DisplayName("Up을 받으면")
        class Context_with_get_up {

            @Test
            @DisplayName("0인 위치에서 -1로 변경 된다.")
            void it_prints_move_up() {

                puzzle.move(up);

                assertThat(puzzle.getVerticalPosition().getValue()).isEqualTo(-1);

            }

        }

        @Nested
        @DisplayName("Down을 3번 받으면")
        class Context_with_get_down_three_times {

            @Test
            @DisplayName("0인 위치에서 3으로 변경 된다.")
            void it_prints_move_down_three_times() {

                for (int i = 0; i < 3; i++) {
                    puzzle.move(down);
                }

                assertThat(puzzle.getVerticalPosition().getValue()).isEqualTo(3);

            }

        }

    }

}
