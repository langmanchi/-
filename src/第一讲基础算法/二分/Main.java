package 第一讲基础算法.二分;

//二分分为  整数二分 浮点数的求解
import java.util.Scanner;
//数的范围，先找到target，之后两个指针前后移动
// 非常经典的模板，对之前记忆的二分 < 的情况是刚开始区间定义l,r 两者开闭区间  r开 r=n  r闭 r=n-1
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] a =new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int q = in.nextInt();
            int x = find(q,n,a);
            if (x ==-1) System.out.println(-1+" "+-1);
            else {
                int pre = x;
                int cur = x;
                while (pre<n&&a[pre]==q) pre++;
                while (cur>=0&&a[cur]==q) cur--;
                System.out.println(cur+1+" "+(pre-1));
            }

        }
    }

    public static int find(int q,int n,int[] a){

        int l = 0;
        int r = n;  // 二分的细节记忆，两种写法中取不取得到是从最开始l,r的标识形式开始的 n-1 《=
        while (l<r){
            // >>的使用方式注意，一般是整体的
            int mid = l + (r-l)/2;
            if (a[mid]>q){
                r = mid;
            }
            if (a[mid]<q){
                l = mid+1;
            }
            if (a[mid]==q) {
                return mid;
            }
        }
        return -1;
    }
}
