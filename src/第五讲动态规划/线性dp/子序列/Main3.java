package 第五讲动态规划.线性dp.子序列;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        String s1 = in.nextLine();
        String s2= in.nextLine();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        //以i j 结尾的最大公共序列
        int[][] dp = new int[a.length+1][b.length+1];

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                if (a[i-1]==b[j-1]) dp[i][j] = dp[i-1][j-1]+1; //相等的这个只能根据上一步求
                else dp[i][j] = Math.max(Math.max(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m ; j++) {

            }
        }
        System.out.println(dp[n][m]);
    }
}
