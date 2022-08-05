package Junghyojae;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 성적통계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int stu = sc.nextInt();
            Integer[] score = new Integer[stu];
            for (int j = 0; j < stu; j++) {
                score[j] = sc.nextInt();
            }
            Arrays.sort(score, Collections.reverseOrder());
            int large = 0;
            for (int j = 0; j < score.length - 1; j++) {
                int a = score[j] - score[j + 1];
                if (large <= a) {
                    large = a;
                }
            }
            System.out.println("Class " + (int) (i + 1));
            System.out.println("Max " + score[0] + ", Min " + score[stu - 1] + ", Largest gap " + large);
        }

    }
}
