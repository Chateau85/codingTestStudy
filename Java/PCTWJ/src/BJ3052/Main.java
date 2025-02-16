package BJ3052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rests = new int[42];
        int n = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            rests[n % 42]++;
        }

        for (int i = 0; i < rests.length; i++) {
            if (rests[i] != 0) {
                count++;
            }
        }

        System.out.print(count);
    }
}
