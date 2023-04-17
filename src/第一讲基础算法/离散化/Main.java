package 第一讲基础算法.离散化;

import java.util.Scanner;

//离散化  感觉画个图就很快理解对应的问题
//数据范围过大，无法用常规方法求出
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        //如何对数据进行一个映射求解呢
        int[] num = new int[2000000001];
        //以1000000000位下标的分界点
        long mid = 1000000000;
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();

        }
    }
}
