package 第一讲基础算法.双指针;
//AcWing 799. 最长连续不重复子序列

import java.util.Scanner;
//对这个算法进行分析理解   理清这种题的做法
// 本质上就是空间换时间的感觉
// 开辟一个数组，适用于正数，负数可能需要皮衣处理
public class Main {
    //一个数组用于存放数据  一个数组用于辅助标记
    static int[] s = new int[100000];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt();
        }
        int res = 0; //记录最长长度

        for (int i = 0,j = 0; i < m ; i++) {
            s[a[i]]++;
            //确保指针位置关系  用于遇到重复数据后，移到前一个指针到前面重复数据的后一位开始

            while (j<i&&s[a[i]]>1) s[a[j++]]--;

            res = Math.max(i-j+1,res);
        }
        System.out.println(res);

    }
}
