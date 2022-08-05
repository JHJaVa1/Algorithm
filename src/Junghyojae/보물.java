package Junghyojae;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 보물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        Integer[] b = new Integer[t];
        for(int i = 0; i<t; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<t; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        int sum = 0;
        for(int i = 0; i<t;i++){
            sum += a[i]*b[i];
        }
        System.out.println(sum);
    }
}
