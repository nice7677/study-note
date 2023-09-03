package kr.objects.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Computer {

    private List<Integer> numbers;

    public Computer(Integer... numbers) {
        this.numbers = Arrays.stream(numbers)
                .collect(Collectors.toList());
    }

}
