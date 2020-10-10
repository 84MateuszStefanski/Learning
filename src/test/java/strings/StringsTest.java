package strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsTest {

    @Test
    void shouldAddTwoStrings() {

        //given
        String result = new String();
        String a = "Legia";
        String b = " mistrz";
        //when
        result = Strings.letters();

        //then
        assertThat(result).isEqualTo("Legia mistrz");

    }
    @Test
    void shouldCompareTwoStrings() {

        //given
        String c = "abcdefg";
        String d = "abvcds";
        //when
        Boolean result = Strings.stringsCompare(c, d);
        //then
        assertThat(result).isFalse();

    }

    @Test
    void shouldCompareTwoIdenticStrings() {

        //given
        String c = "abcdefg";
        String d = "abcdefg";
        //when
        Boolean result = Strings.stringsCompare(c, d);
        //then
        assertThat(result).isTrue();

    }

    @Test
    void shouldCompareTwoIdenticStringsWithNoCase() {

        //given
        String c = "abCDefg";
        String d = "ABcdefg";
        //when
        Boolean result = Strings.stringsCompareNoCase(c, d);
        //then
        assertThat(result).isTrue();

    }
    @Test
    void shouldCheckWhichStringIsLongerB() {

        //given
        String a = "abc";
        String b = "abcde";
        //when
        String result = Strings.whichLonger(a,b);
        //then
        assertThat(result).isEqualTo("String b is longer than String a");
    }

    @Test
    void shouldCheckAreStringsTheSameLength() {

        //given
        String a = "abcde";
        String b = "abcde";
        //when
        String result = Strings.whichLonger(a,b);
        //then
        assertThat(result).isEqualTo("Both Strings are the same length");
    }
}
