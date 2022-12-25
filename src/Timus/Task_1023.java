package Timus;

import java.util.Scanner;

public class Task_1023 {
    public static void main(String[] args) {

        long i = 3;
        long a;


        Scanner in = new Scanner(System.in);
        a = in.nextLong();
        while (a % i != 0) {
            i++;
        }

        System.out.println(i - 1);
    }
}
