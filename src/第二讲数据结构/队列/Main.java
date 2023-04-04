package 第二讲数据结构.队列;

/** 题目描述
 实现一个队列，队列初始为空，支持四种操作：

 (1) “push x” – 向队尾插入一个数x；

 (2) “pop” – 从队头弹出一个数；

 (3) “empty” – 判断队列是否为空；

 (4) “query” – 查询队头元素。

 现在要对队列进行M个操作，其中的每个操作3和操作4都要输出相应的结果。

 输入格式
 第一行包含整数M，表示操作次数。

 接下来M行，每行包含一个操作命令，操作命令为”push x”，”pop”，”empty”，”query”中的一种。

 输出格式
 对于每个”empty”和”query”操作都要输出一个查询结果，每个结果占一行。

 其中，”empty”操作的查询结果为“YES”或“NO”，”query”操作的查询结果为一个整数，表示队头元素的值。

 数据范围
 1≤M≤100000,
 1≤x≤109,
 所有操作保证合法。

 输入样例：

 10
 push 6
 empty
 query
 pop
 empty
 push 3
 push 4
 pop
 query
 push 6
 输出样例：

 NO
 6
 YES
 4

 */

import java.util.*;

public class Main {
    static int N = 100010;
    static int[] queue = new int[N];
    public static void main(String[] args) throws Exception{
        //队列尾进头出，tt:下一个入队列位置，hh:下一个出队列位置
        int tt = 0;
        int hh = 0;
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        while (m-- > 0){
            String opt = scanner.next();
            if ("push".equals(opt)){
                int x = scanner.nextInt();
                queue[tt++] = x;
            }else if ("pop".equals(opt)){
                hh++;
            }else if ("empty".equals(opt)){
                System.out.println(tt - hh == 0 ? "YES" : "NO");
            }else if ("query".equals(opt)){
                System.out.println(queue[hh]);
            }
        }
    }

}

//自己多看看标准的板子