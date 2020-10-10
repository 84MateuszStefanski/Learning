package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        int amountOfLarger = 0;
        int amountOfSmaller = 0;
        int amountOfPerfect = 0;
        int size;

        for (int i = 0; i < n; i++) {
            size = scanner.nextInt();
            if (size == 1) {
                amountOfLarger++;
            } else if (size == -1) {
                amountOfSmaller++;
            } else {
                amountOfPerfect++;
            }
        }

        System.out.println(amountOfPerfect + " " + amountOfLarger + " " + amountOfSmaller);
    }
}
