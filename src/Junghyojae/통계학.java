package Junghyojae;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 통계학 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int max = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < t; i++){
            a[i] = sc.nextInt();
        }

        a1 = (int)Math.round(Arrays.stream(a).sum()/(double)t);
        Arrays.sort(a);
        a2 = a[(t-1)/2];
        a4 = a[t-1] - a[0];
        int cnt = 0;
        int num = 0;
        map.put(1,a[0]);
        for(int i = 0; i<t-1 ; i++) {
            if (a[i] == a[i + 1]) {
                cnt++;
            }else {
                cnt = 0;
            }
            if(max < cnt){
                max = cnt;
                num = 1;
                map.clear();
                map.put(num,a[i]);
            }else if(max == cnt){
                num += 1;
                map.put(num,a[i]);
            }
        }
        if(map.size() != 1){
            a3 = map.get(2);
        }else {
            a3 = map.get(1);
        }
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
