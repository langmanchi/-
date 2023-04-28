package 第二讲数据结构.单调队列.滑动窗口;

import java.io.*;
import java.util.Scanner;

//单调队列的考察点，之后去进行代码谁想录的二刷
//理解单调队列的思想

public class Main {
    static int N =1000010;
    static int[] a = new int[N];
    static int[] q = new int[N];   //存的是插入数的下标
    static int hh,tt;
    //注意细节上面的考察 两次for寻找最大最小值，之后更新最大最小值 打印
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] st = bf.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);
        String[] str = bf.readLine().split(" ");
        for(int i = 0 ; i < n ; i ++ ) a[i] = Integer.parseInt(str[i]);


        hh = 0;tt=-1;  //hh 头指针  rr 尾指针

        //这里只涉及数组下标的处理
        for (int i = 0; i < n; i++) {
            //窗口向右移动，先判断队头的下标在窗口范围内不
            if (hh<=tt && q[hh] < i-k+1) hh++;
            // 插入的数据，保持单调性弹出对应数据
            while (hh<=tt&&a[q[tt]]>=a[i]) tt--;
            //将当前数的下标插入队列中（队列中存的是输入数的下标）
            q[++tt] = i;
            // 确保插入数大于等于K这个滑动窗口的范围才能开始输出
            if (i>=k-1) System.out.print(a[q[hh]] + " ");
        }
        System.out.println();
        hh = 0;tt=-1; //重新赋值处理一遍
        //这里只涉及数组下标的处理
        for (int i = 0; i < n; i++) {
            //窗口向右移动，先判断队头的下标在窗口范围内不
            if (hh<=tt && q[hh] < i-k+1) hh++;
            // 插入的数据，保持单调性弹出对应数据
            while (hh<=tt&&a[q[tt]]<=a[i]) tt--;
            //将当前数的下标插入队列中（队列中存的是输入数的下标）
            q[++tt] = i;
            // 确保插入数大于等于K这个滑动窗口的范围才能开始输出
            if (i>=k-1) System.out.print(a[q[hh]] + " ");
        }

    }

}
