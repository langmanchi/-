package 力扣;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

class Graph {

     int n;
     int[][] edge;
     int[][] a;
     public Graph(int n, int[][] edges) {
         this.n = n;
         a = new int[n][n];
         edge = new int[edges.length][edges[0].length];
         for (int i = 0; i < edges.length; i++) {
             for (int j = 0; j < edges[0].length; j++) {
               edge[i][j] = edges[i][j];
             }
         }

         for (int i = 0; i < edges.length; i++) {
             a[edges[i][0]][edges[i][1]] = edges[i][2];
         }
     }

     //改变数据
     public void addEdge(int[] edge) {
         if (a[edge[0]][edge[1]]==0&&a[edge[1]][edge[0]]==0){
             a[edge[0]][edge[1]] = edge[2];
         }
     }

     //最小的代价  这一步非常的重要，建议学习
//     public int shortestPath(int node1, int node2) {
//         Stack<Integer> set = new Stack<>();
//         //无解的情况
//         set.push(node1);
//         //这里写不懂，自后看题解
//         while (!set.isEmpty()){
//             for (int i = 0; i < n; i++) {
//                 if(a[set.pop()][i] !=0){
//                     set.push()
//                 }
//             }
//         }
//          return a[node1][node2];
//     }
}
