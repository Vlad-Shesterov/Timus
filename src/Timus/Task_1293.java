package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task_1293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = (N * (A * B)) * 2;
        pw.println(result);
        pw.flush();
    }
}
