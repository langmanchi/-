package 第一讲基础算法.归并;


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

        merge_sort(a,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void merge_sort(int[] a,int l,int r){
        if (l>=r) return ;
        int mid = l+r >>1;
        merge_sort(a,l,mid);
        merge_sort(a,mid+1,r);

        //采用双指针的做法进行分析
        int k = 0,i=l,j = mid+1; //这个j的取值理解
        while (i<=mid&&j<=r){
            if (a[i]<=a[j]) tmp[k++] = a[i++];
            else tmp[k++] = a[j++];
        }
        //对于一边处理完，另外一边没处理完的总结
        while (i<=mid) tmp[k++] = a[i++];
        while (j<=r) tmp[k++] = a[j++];

        //辅助数组重新填回原数组l,r区间  记忆分析
        for ( i = l,k=0; i<= r; i++,k++) {
            a[i] = tmp[k];
        }

    }
}
