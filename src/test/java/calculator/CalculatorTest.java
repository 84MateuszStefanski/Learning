package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void shoudReturnNumberToPower(){

        //given
        int a = 2;
        int b = 2;
        //when
        double result = Calculator.powered(a, b);
        //then
        assertEquals(4,result);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void shouldCompareTwoStringsSameCase() {

        //given
        String a = "Legia";
        String b = "Legia";
        //when
        boolean result = Calculator.comparison(a, b);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldCompareTwoStringsDifferentCase() {

        //given
        String a = "LeGIa";
        String b = "legia";
        //when
        boolean result = Calculator.comparison(a, b);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldCompareTwoStringsIsFalse() {

        //given
        String a = "Wisła";
        String b = "Legia";
        //when
        boolean result = Calculator.comparison(a, b);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldPrintLoop(){

        //given
        int start = 0;
        int rotation = 3;

        //when

        int result = Calculator.loop(start,rotation);

        //then
        assertEquals(3,result);

    }

    @Test
    void shouldCheckBmi() {

        //given
        double weight = 100;
        double height = 20;
        //when
        double result = Calculator.bmiCalc(height,weight);
        //then
        assertThat(result).isEqualTo(0.25);
    }




}
