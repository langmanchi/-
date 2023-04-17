package 第五讲动态规划.背包问题;

import java.util.Scanner;

// 01 背包问题的详解  每个物品只能使用一次
// 01 背包，价值最大，枚举所有可能
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        //先将物品的体积与价值存海
        int[] size = new int[n+1];
        int[] v = new int[n+1];
        for (int i = 1; i <= n ; i++) {
            size[i] = in.nextInt();
            v[i] = in.nextInt();
        }
        // dp【i】【j】 表示背包容量为j的时候取1-i之间的物品价值max
        int[][] dp = new int[n+1][m+1];

        //初始化操作

        for (int i = 1; i <=n ; i++) { //先种类 后容量
            for (int j = 1; j <=m; j++) {
              if (size[i]<=j){
                  //对于取和不取的后面dp[i-1][j-size[i]]+v[i] 如果dp[i]的话会导致重复背包
                  dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-size[i]]+v[i]);
              }else {
                  dp[i][j] = dp[i-1][j];
              }
            }
        }

//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=m ; j++) {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }


        System.out.println(dp[n][m]);
    }
}
