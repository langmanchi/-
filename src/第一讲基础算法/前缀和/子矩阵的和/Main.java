package 第一讲基础算法.前缀和.子矩阵的和;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();

        //输入的矩阵处理分析  多一位便于处理与理解
        int[][] arr = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m ; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        //获得对应的数据之后开始填每个位置的矩阵和
        // 矩阵计算公式
        int[][] s = new int[n+1][m+1];
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <= n ; j++) {
                s[i][j] = s[i-1][j]+s[i][j-1]-s[i-1][j-1]+arr[i][j];
            }
        }

        //针对每次查询的处理
        while (q-->0){
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            //对于公式的计算
            int res = s[x2][y2]-s[x1-1][y2]-s[x2][y1-1]+s[x1-1][y1-1];
            System.out.println(res);
        }
    }
}
