package Timus;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1021 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N[] = new int[in.nextInt()];
        for (int i = 0; i < N.length; i++) {
            N[i] = in.nextInt();
        }

        int M[] = new int[in.nextInt()];
        for (int i = 0; i < M.length; i++) {
            M[i] = in.nextInt();
        }

        Arrays.sort(N);
        Arrays.sort(M);;

        for (int i = 0; i < N.length; i++) {
            if (Arrays.binarySearch(M, 10000 - N[i]) >= 0) {
                System.out.println("YES");
                System.exit(0);
            }
        }

        System.out.println("NO");

    }
}
