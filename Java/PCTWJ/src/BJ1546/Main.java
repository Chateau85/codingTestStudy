package BJ1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            max = Math.max(max, score[i]);
        }
        double[] newScores = new double[N];
        for (int i = 0; i < N; i++) {
            if (score[i] < max) {
                newScores[i] = ((double) score[i] / max) * 100;
            } else {
                newScores[i] = 100;
            }
        }
        double result = 0.0;
        for (int i = 0; i < N; i++) {
            result += newScores[i];
        }
        System.out.println(result / N);
    }
}
