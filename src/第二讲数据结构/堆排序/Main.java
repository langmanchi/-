package 第二讲数据结构.堆排序;
//边写板子，一边对板子进行理解记忆


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static int len;
    static int heap[];


    public static void swap(int i,int j){
        int t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;
    }

    static void down(int i){
        int min = i,l = 2*i,r =2*i+1;
        if (l<=len&&heap[min]>heap[l]) min = l;
        if (r<=len&&heap[min]>heap[r]) min = r;
        if (min!=i){
            swap(i,min);
            down(min); //交换过后的节点可能还有左右儿子 ，需要递归都没有为止
        }
    }


    //换一种输入输出的模板，有时候scanner会有一些问题  对于数据学会自己处理
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        len = in.nextInt();
        heap = new int[len+1];  //从1开始，便于存储

        int k = in.nextInt();
        // 换一种输入输出的模板，这里可能会因为空格缩进啥的导致识别输入错误
        for (int i = 1; i <=len ; i++) {
            heap[i] =in.nextInt();
        }
        for (int i = 1; i <=len ; i++) {
            System.out.println(heap[i]);
        }
        //这种方法数据读取的时候又不敢

        //建堆，len/2是最后一个飞叶子节点，将所有节点找到它对应的位置
        for (int i = len/2; i>=1 ; i--) down(i);
        //建好堆之后，取第一个，之后用最后的叶子节点覆盖，对前n-1个数以及建好的堆进行sink操作
        for (int i = 1; i <=k; i++) {
            System.out.print(heap[1]+" ");
            heap[1] = heap[len--];  //第一个元素被覆盖
            down(1); //已经建好的只需要下沉到对应位置就行
        }

    }
}
