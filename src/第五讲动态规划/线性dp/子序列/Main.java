package 第五讲动态规划.线性dp.子序列;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//子序列与连续数组不太一样

//对于子序列的问题，这个题需要复习如何确定dp的含义
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(in.readLine());
        int[] a = new int[n];
        String[] s = in.readLine().split(" ");
        for (int i = 0; i < n  ; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        int[] dp = new int[n];  //以num【i】结尾的序列的max

        //初始化dp数组
        for (int i = 0; i < n; i++) {
            dp[i] = 1; //以i结尾，至少自己算一个
        }
        int result = 1;
        for (int i = 1; i <n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i]>a[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
            if (dp[i]>result) result = dp[i];
        }

        System.out.println(result);
    }
}
