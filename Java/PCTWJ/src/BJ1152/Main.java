package BJ1152;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int result = 0;
        for (int i = 0; i < s.length; i++) {
            if (!s[i].isEmpty()) {
                result++;
            }
        }
        System.out.print(result);
    }
}
