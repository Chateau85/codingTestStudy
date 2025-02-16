package BJ2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] results = new String[t];
        for (int i = 0; i < t; i++) {
            sb = new StringBuilder();
            int n = sc.nextInt();
            String s = sc.next();
            for (int k = 0; k < s.length(); k++) {
                for (int j = 0; j < n; j++) {
                    sb.append(s.charAt(k));
                }
            }
            results[i] = String.valueOf(sb);
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}