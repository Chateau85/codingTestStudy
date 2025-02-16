package BJ10811;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }
        for (int l = 0; l < M; l++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            while (i < j) {
                int temp = basket[i];
                basket[i++] = basket[j];
                basket[j--] = temp;
            }
        }
        for (int l = 0; l < basket.length; l++) {
            System.out.print(basket[l] + " ");
        }
    }
}
