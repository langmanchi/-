package 第一讲基础算法.位运算;

import java.util.Scanner;

/**  补充对应的知识
 *
 */


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] n = new int[m];
        for (int i = 0; i <m; i++) {
            n[i] = in.nextInt();
            System.out.print(to(n[i])+" ");
        }
    }

    public static int to(int a){
        int count=0;
        while (a!=0){
            if ((a&1)==1) count++;
            a  = a>>1;
        }
        return count;
    }
}
