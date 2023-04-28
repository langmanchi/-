package 华为机试;
import java.util.*;

// 图的遍历，美团上面的题
public class Main {

    //对于图的有一种做法，自己多看代码，借鉴大佬的思路
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            ArrayList[] graph = new ArrayList[a + 1];

            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList();
            }

            for (int i = 0; i < a - 1; i++) {
                int start = in.nextInt();
                int end = in.nextInt();
                graph[start].add(end);
                graph[end].add(start);
            }

            //a-1  为边数
            int longPath = findLongPath(1, graph, -1, new boolean[a + 1]);

            System.out.println((2 * (a - 1)) - longPath);
        }
    }

    /**
     * 从1 出发,找 最长路径
     * <p>
     * return ,最长路径
     */
    private static int findLongPath(int start, ArrayList[] graph, int curPathLen,
                                    boolean[] visit) {
        if (!visit[start]) {
            visit[start] = true;
            curPathLen++;
            int maxSubLen = 0;
            for (Object o : graph[start]) {
                int end = (int) o;
                //是否已经被访问
                int longPath = findLongPath(end, graph, 0, visit);
                maxSubLen = Math.max(longPath, maxSubLen);

            }
            return curPathLen + maxSubLen;
        } else {
            return 0;
        }
    }
}

