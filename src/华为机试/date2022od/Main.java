package 华为机试.date2022od;

import java.util.Scanner;

public class Main {
    //最长公共子串的问题
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = in.nextLine();
        char[] a = str.toCharArray();
        char[] b = str1.toCharArray();
        int m =a.length;
        int n = b.length;

        int[][] dp = new int[a.length + 1][b.length + 1];
        //含义 dp[i][j]表示第i，j 的最大公共子创
        for (int i = 0; i < m+1 ; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < n+1; i++) {
            dp[0][i] = 0;
        }

        int max = 0;
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (a[i-1]==b[j-1]) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = 0; //不是连续的就去掉

                max = Math.max(max,dp[i][j]);
            }
        }

        System.out.println(max);


    }
}
