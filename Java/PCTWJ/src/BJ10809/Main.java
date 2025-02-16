package BJ10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int j : alphabet) {
            System.out.print(j + " ");
        }
    }
}
