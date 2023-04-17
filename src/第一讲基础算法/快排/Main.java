package 第一讲基础算法.快排;

import java.io.IOException;
import java.util.Scanner;

//如何快速理解三数快排  以及记忆对应的板子
public class Main {
    //背一个模板，处理对应的边界问题
    public static void qucik_sort(int[] a,int l,int r){
        if (l>=r) return;  //区间只有一个数，没有数直接return
        //设置偏移量  以j背的模板

//        int mid = l+r >> 1;
//        int i=l,j=r;
//        while(i<j){
        //这种写法，第一回交换之后直接无法移动
//            while(a[i]<a[mid]) i++;
//            while(a[j]>a[mid]) j--;
//            if(i<j){
//                int tmp = a[i];
//                a[i] = a[j];
//                a[j]= tmp;
//            }
//        }
//        System.out.println(j);
        int x = a[l+r >> 1],i=l-1,j=r+1;

        while (i<j){
            do i++;while (a[i]<x);
            do j--;while (a[j]>x);
            System.out.println(i+" "+j);
            if (i<j)  {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }

        qucik_sort(a,l,j);
        qucik_sort(a,j+1,r);
    }

    public static void main(String[] args) throws IOException {
        //Java中采用BufferRedaer进行读入  可能会快一些
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int[] a = new int[m];
        //如何处理这个输入最后没有空格的判断
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        qucik_sort(a,0,m-1);
        for (int i = 0; i < m; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
