package 第三章.搜索与图论.树和图的深度优先遍历;


import java.util.Scanner;

// 变式题目 求树上的最大值 华为暑期机试
//建图方法的理解   链式前向的理解分析

//可以顶点用数组，结点采用 链表实现   之后采用这种做法实现
public class Main {
    static int N = 100010,M=N*2,idx,n;

    static int[] h =new int[N];
    static int[] e = new int[M]; //存的是双倍，所以是M
    static int[] ne = new int[M]; //存的是双倍，所以是M
    static boolean[] st = new boolean[N];

    static int ans =N;

    /**
     * 链接表，存储方法
     * 邻接表不用管执行顺序，只需要知道每个节点能够执行到多少个节点就行
     * e 这条边的终点
     * ne 表示与这个边起点相同的上一条边的编号
     * head[i]数组，表示以i为起点的最后一条边的编号。
     * @param a
     * @param b
     */
    //对链式前向的理解复习
    public static void add(int a,int b){
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx++;
    }

    // 深度优先遍历可以算出每个子树点的数量
    // 这里这个代码还是不太清楚这个代码的思想
    public static int dfs(int u){
        int res = 0;   //删除这个点 过后连通块的最大值
        st[u] = true;
        int sum = 1;  // 单前这个点算一个

        //单链表遍历
        for (int i = h[u]; i != -1; i = ne[i]) {
            int j = e[i]; //将每一个指过的点用变量表示出来
            if (!st[j]){ //如果是没用的，没被标记的，就可以执行
                int s = dfs(j);   //这里就是深度搜索   s当前子树的大小

                //然后递归他的邻接表上面所有能够抵达的点
                //然后返回的数量是他所删除的点下面的连通块的大小
                res = Math.max(res,s);
                sum+=s;  //儿子加上根节点
            }
        }
        /***
         * 因为邻接表表中只是往下面执行，删除的点的上面的连通块可能是最大的连通块，
         * 所以需要用总数减去我们下面所统计出来的最大的连通块
         * 然后将最大的连通块的值赋值给res
         * **/
        res = Math.max(res,n-sum);
        ans = Math.min(res,ans);
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        //赋值为一，对于这种题存图的细节
        for (int i = 1; i <N ; i++) {
            h[i] = -1;
        }
        //案例的输入输出
        for (int i = 0; i < n-1; i++) {
            int a =in.nextInt();
            int b = in.nextInt();
            add(a,b);
            add(b,a);
        }
        dfs(1);
        System.out.println(ans);
    }
}
