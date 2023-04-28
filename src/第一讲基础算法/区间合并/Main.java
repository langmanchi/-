package 第一讲基础算法.区间合并;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        //二维数组的排序的写法
        // Arrays.sort方法进行一下总结以及分析
        //先按第一个排序，之后按照第二个排序，尽量重写方法 lamada表达式有时候看不懂

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] s = in.readLine().split(" ");
             a[i]= new int[]{Integer.parseInt(s[0]),Integer.parseInt(s[1])};

        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });


        int x=1;
        int st = a[0][0];
        int ed = a[0][1];

        for (int i = 1; i < n; i++) {
            if (ed>a[i][1]) continue;
            if (a[i][0]<=ed&&ed<a[i][1]) ed = a[i][1];
            if (a[i][0]>ed) {
                st = a[i][0];
                ed = a[i][1];
                x++;
            }

        }
        System.out.println(x);

    }
}
