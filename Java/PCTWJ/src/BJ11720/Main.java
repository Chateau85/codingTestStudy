package BJ11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = s.charAt(i) - '0';
            result += num;
        }
        System.out.print(result);
    }
}
