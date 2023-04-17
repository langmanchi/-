package 第二讲数据结构.并查集;

import java.util.Scanner;

public class Main1 {
    static int[] p;
    static int[] size;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        p = new int[n+1];
        size  = new int[n+1];
        for (int i = 1; i <=n; i++) {
            p[i] = i;
            size[i] = 1;
        }

        for (int i = 0; i < m; i++) {
            String s = in.next();


            //a的根节点指向 b集合的祖先
            if (s.equals("C")) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (find(a)==find(b)) continue;
                else {
                    size[find(b)]+=size[find(a)];
                    p[find(a)] = find(b);
                }
            }
            else if (s.equals("Q1")){
                int a = in.nextInt();
                int b = in.nextInt();
                if (find(a)==find(b)){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
            else {
                int a = in.nextInt();
                System.out.println(size[find(a)]);
            }
        }
    }

    public static int find(int x){
        if (p[x]!=x) p[x]= find(p[x]);

        return p[x];
    }
}
