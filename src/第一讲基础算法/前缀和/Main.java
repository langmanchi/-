package 第一讲基础算法.前缀和;

import java.util.Scanner;
// 处理的基本像一个板子了
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
//記錄前缀和
        int[] a = new int[m+1];
        a[0]=0;
        int sum = 0;
        for (int i = 1; i <m + 1 ; i++) {
            sum+=in.nextInt();
            a[i]=sum;
        }

        for (int i = 0; i <n ; i++) {
            int b = in.nextInt();
            int b1 = in.nextInt();
            System.out.println(a[b1]-a[b-1]);
        }
    }
}
