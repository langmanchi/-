package 第一讲基础算法.归并.拓展;
//力扣有一道数据范围的变式题目，可以去做做
import java.util.Scanner;

//根快排不同的地方进行对应的分析
public class Main {
    //这里必须前期把值弄好，考虑数据的边界
    private static int N = 100010;
    private static int[] a= new int[N];
    private static int[] tmp= new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(merge_sort(a,0,n-1));

    }


    public static long merge_sort(int[] a,int l,int r){
        if (l>=r) return 0 ;
        int mid = l+r >>1;

        long s = merge_sort(a,l,mid)+ merge_sort(a,mid+1,r);

        //采用双指针的做法进行分析
        int k = 0,i=l,j = mid+1; //这个j的取值理解
        while (i<=mid&&j<=r){
            if (a[i]<=a[j]) tmp[k++] = a[i++];
            else {
                s+=mid-i+1;
                tmp[k++] = a[j++];
            }
        }
        //对于一边处理完，另外一边没处理完的总结
        while (i<=mid) tmp[k++] = a[i++];
        while (j<=r) tmp[k++] = a[j++];

        //辅助数组重新填回原数组l,r区间  记忆分析
        for ( i = l,k=0; i<= r; i++,k++) {
            a[i] = tmp[k];
        }
        return s;

    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int m = in.nextInt();
//        int[] a = new int[m];
//        for (int i = 0; i < m; i++) {
//            a[i] = in.nextInt();
//        }
//        int count = 0;
//        for (int i = 0; i < m; i++) {
//            for (int j = i+1; j < m; j++) {
//                if (a[j]<a[i]){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}
