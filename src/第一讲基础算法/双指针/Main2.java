package 第一讲基础算法.双指针;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        int k = 0;
        int k1 = 0;
        //通过判断k最后的位置  最后一位需要迈过去
        for (k1 = 0; k1 < m; k1++) {
            if (a[k]==b[k1]) k++;
            if (k==n) {
                break;
            }
        }
        //最后的边界处理  上面的数据都等完之后 k可以取n-1，在=n的时候退出循环
        if (k==n) System.out.println("Yes");
        else System.out.println("No");

    }
}
