package Timus;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task_1209 {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        long N = in.nextLong();

        for (long i = 0; i < N; i++) {
            long k = in.nextLong() - 1;

            double x = (sqrt(1 + 8*k) - 1)/2;
            if (abs(x - floor(x)) < 10e-7) {
                System.out.print("1 ");
            } else
                System.out.print("0 ");
        }

        in.close();

    }

}
