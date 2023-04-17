package 第二讲数据结构.单调队列.滑动窗口;

import java.util.Scanner;

//单调队列的考察点，之后去进行代码谁想录的二刷
//理解单调队列的思想

public class Main {
    static int[] a = new int[1000010];
    static int max = 0;
    static int min = 0;
    //注意细节上面的考察 两次for寻找最大最小值，之后更新最大最小值 打印
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }


        //用两个字符串来存把
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        str1.append(min+" ");
        str2.append(max+" ");
        //先求出第一个的最大值与最小值  之后再对数据进行更新
        for (int i = 1; i <= n-k; i++) {
            //题目还是理解错了
            str1.append(min+" ");
            str2.append(max+" ");
        }

        System.out.println(str1.toString());
        System.out.println(str2.toString());


    }

//    //如何求最大值与最小值
//    public static void sort(int k){
//        min = a[0];
//        max = a[0];
//        for (int i = 1; i < k; i++) {
//            if (a[i]>max){
//                max = a[i];
//            }
//            if (a[i]<min){
//                min = a[i];
//            }
//        }
//    }

}
