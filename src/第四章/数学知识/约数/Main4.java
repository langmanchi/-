package 第四章.数学知识.约数;

import java.util.Scanner;

public class Main4 {
    //辗转相除法的非递归实现
    public static int gcd(int m,int n){
        int a = Math.max(m,n);
        int b = Math.min(m,n);
        while (a>=b){
            int temp = b;
            int tar = a%b;
            if (tar==0) break;
            a  = temp;
            b = tar;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(gcd(a,b));
        }
    }
}
