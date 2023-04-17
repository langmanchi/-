package 第一讲基础算法.前缀和.差分;


import java.util.Scanner;

// 差分是前缀和的逆过程进行分析
//
public class Main {
    static int N;
    //差分数组，就是表示与前一个数据的差值
    static int[] b;


    public static void insert(int l,int r,int c){
        b[l]+=c;
        b[r+1]-=c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N  = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[N+1];
        b = new int[N+2]; //注意数组越界异常

        //差分数组的初始化
        for (int i = 1; i <=N; i++) {
            a[i] = in.nextInt();
            insert(i,i,a[i]);
        }

        while (m-->0){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            insert(x,y,z);



        }
        for (int i = 1; i <=N ; i++) {
            a[i] = a[i-1]+b[i];
            System.out.print(a[i]+" ");
        }


    }
}
