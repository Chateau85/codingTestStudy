package BJ2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sA = new StringBuilder(String.valueOf(a));
        StringBuilder sB = new StringBuilder(String.valueOf(b));
        sA.reverse();
        sB.reverse();

        System.out.print(Math.max(Integer.parseInt(String.valueOf(sA)), Integer.parseInt(String.valueOf(sB))));
    }
}
