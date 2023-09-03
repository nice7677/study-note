package kr.objects.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Human {

    private List<Integer> numbers;

    public Human(Integer... numbers) {
        this.numbers = Arrays.stream(numbers)
                .collect(Collectors.toList());
    }

}
