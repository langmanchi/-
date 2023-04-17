package 第二讲数据结构.并查集;

//代码短，思路比较轻巧
//就是建一个数组，将连通的数据更新为同一个数据  路径压缩，每回找根节点

import java.util.Scanner;


public class Main {
    static int[] p;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
         p = new int[n+1];
        for (int i = 1; i <=n; i++) {
            p[i] = i;
        }

        for (int i = 0; i < m; i++) {
            String s = in.next();
            int a = in.nextInt();
            int b = in.nextInt();

           if (s.equals("M")) p[find(a)] = find(b);  //a的根节点指向 b集合的祖先
            else {
                if (find(a)==find(b)) System.out.println("Yes");
                else System.out.println("No");
           }

        }
    }

    public static int find(int x){// x的根节点+路径压缩

        //集合的父节点指向的不是自己,说明这不是一个根节点，递归的寻找自己的根节点
        //找到根节点之后  循环退出的时候将这个路径的结合都指向根节点 举例就明白了
        if (p[x]!=x) p[x] = find(p[x]);

        return p[x];
    }
}
