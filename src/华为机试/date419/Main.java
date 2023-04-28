package 华为机试.date419;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 4.19 耐心复习

//一般开一个boolean数组用于标记 有些题目当中这个比较重要


//dfs求出所有的可能  对求出的集合进行筛选  最后对数据处理输出
public class Main {

    private static int[] h = new int[10005];
    private static int[] e= new int[10005];
    private static int[] en= new int[10005];
    private static int idx,s;
    static int[] x;
    static List<List<Integer>> res =  new ArrayList<>();
    static List<Integer> list = new ArrayList<>();
    public static void add(int a,int b){
        e[idx] = b;
        en[idx] = h[a];
        h[a] = idx++;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < n; i++) {
            h[i] = -1; //赋值为-1，用于最后判断
        }

        for (int i = 0; i < m; i++) {
            int a =in.nextInt();
            int b = in.nextInt();
            add(a,b);
        }

        s = in.nextInt();
        int[] x = new int[s];
        for (int i = 0; i < s; i++) {
            x[i] = in.nextInt();
        }
        list.add(0);
        dfs(0,list);

        //对数据进行去重分析
        int max=10005;
        List<Integer> result = new ArrayList<>();
        for (int i = res.size()-1; i >=0 ; i--) {
            boolean tar =true;
            for (int j = 0; j < s; j++) {
                if (res.get(i).contains(x[j])){
                    tar =false;
                    break;
                }
            }
            int size = res.get(i).size();
            if (tar&&size<m) {
                result = res.get(i);
                m = size;
            }
        }
        StringBuffer str = new StringBuffer();
        for (Integer e:result) {
            str.append(e+"->");
        }
        String st = str.toString().substring(0,str.toString().length()-2);
        System.out.println(st);

    }

    //这里需要返回的是一个宽度优先遍历之后的一个数据
    public static void dfs(int u,List<Integer> list){
        if (h[u]==-1){
           res.add(new ArrayList<>(list));
        }
        //这是对与根节点连接表的表里
        for (int i = h[u]; i != -1 ; i = en[i]) {
            list.add(e[i]);
            dfs(e[i],list);
            list.remove(list.size()-1);
        }
    }
}
