package main;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main2Test {

    @Test
    void shouldReturnLargestNumDivBy4() {
        Scanner scanner = new Scanner(System.in);
        //given
        int n = 5;
        int currentMax = 0;
        int num = scanner.nextInt();
        //when
        int result = Main2.highDivBy4()
        //then


    }
}
