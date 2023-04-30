package 第四章.数学知识.质数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println(is(in.nextInt()));
        }
    }

    public static String is(int x){
        if (x==1) return "No";
        if (x==2) return "Yes";
        //  x/i用于取代开方函数  用于求解
        for (int i = 2; i <= x/i; i++) {
            if (x%i==0) return "No";
        }
        return "Yes";
    }
}
