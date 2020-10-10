package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
////        int n = scanner.nextInt();
////        int currentMax = 0;
////        int num;
////        // pętla wybiera największą z podanych liczb podzielną przez 4
////        for (int i = 0; i < n; i++) {
////            num = scanner.nextInt();
////            if (num % 4 == 0 && num > currentMax){
////                currentMax = num;
////            }
////        }
////        System.out.println(currentMax);
//        System.out.println(highDivBy4());
    }
    public static int highDivBy4 (){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int currentMax = 0;
        int num;
        // pętla wybiera największą z podanych liczb podzielną przez 4
        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (num % 4 == 0 && num > currentMax){
                currentMax = num;
            }
        }
        return currentMax;
    }
}
