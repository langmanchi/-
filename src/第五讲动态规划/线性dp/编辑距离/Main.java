package 第五讲动态规划.线性dp.编辑距离;

import java.util.Scanner;

public class Main {
    //将大的变成小的大概需要多少操作
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        int  n = Integer.parseInt(ss);
        String s1 = in.nextLine();
        String ss1 = in.nextLine();
        int  m = Integer.parseInt(ss1);
        String s2 = in.nextLine();

        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i <n+1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <m+1 ; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];

                else {
                    dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                }
            }
        }

        System.out.println(dp[n][m]);

    }
}
