package 华为机试.date2022od;

import java.util.Scanner;

//单调栈没有用熟练
//倒着插入，维护一个单调栈
//大厂的笔试，没有思路的时候就无脑暴力做题
public class Main1 {

    //先来暴力做一下看看
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] a = new int[m];
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt();
        }

        //在暴力的做法上进行优化，这里单调栈不适合这个做法 暴力 65%
        //在暴力的基础上对算法进行优化异步


        for (int i = 0; i < m; i++) {
            System.out.print(res[i]+" ");
        }

    }
}
