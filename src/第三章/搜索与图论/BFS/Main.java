package 第三章.搜索与图论.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    //用二维数组来标记有没有走过
    static int n, m;
    static int[][] visit;
    static int[][] a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        visit = new int[n][m];
        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }


        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));

        int mov = -1;
        while (!queue.isEmpty()) {
            int p = queue.size();
            mov++;
            while (p-- > 0) {
                Pair pair = queue.poll();
                if (pair.x == n - 1 && pair.y == m - 1) {
                    System.out.println(mov);
                    return;
                    //如何判断节点的有效性加入  加入的下标越界的组合，已经便利的，以及障碍物
                } else if (pair.x < 0 || pair.x >= n || pair.y < 0 || pair.y >= m || visit[pair.x][pair.y] == 1 || a[pair.x][pair.y] == 1) {
                    continue;
                }

                visit[pair.x][pair.y] = 1;

                queue.add(new Pair(pair.x - 1, pair.y));
                queue.add(new Pair(pair.x + 1, pair.y));
                queue.add(new Pair(pair.x, pair.y - 1));
                queue.add(new Pair(pair.x, pair.y + 1));
            }

        }

    }
}


class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}