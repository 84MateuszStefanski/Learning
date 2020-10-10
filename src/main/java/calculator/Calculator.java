package calculator;

public class Calculator {
    public static void main(String[] args) {

    }

    public static double powered(int a, int b) {
        return Math.pow(a, b);
    }

    public static boolean comparison(String a, String b) {
        return a.toLowerCase().equals(b.toLowerCase());
    }

    public static int loop(int start, int rotation) {
        int i = 0;
        for (i = start; i < rotation ; i++) {

        }
        return i;
    }

    public static double bmiCalc(double heightMetr, double weightKg) {
        double bmi = weightKg / Math.pow(heightMetr,2);
        return bmi;
    }


}
