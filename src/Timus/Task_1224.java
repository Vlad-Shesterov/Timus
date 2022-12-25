package Timus;

import java.util.Scanner;

public class Task_1224 {
    public static long turns(long N, long M) {

        if (N <= M) {
            return  4*(N/2) - 2*((N + 1) % 2);
        }

        return 4*(M/2) - 2*((M + 1) % 2) + 1;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long M = in.nextLong();
        System.out.println(turns(N, M));

    }

}
