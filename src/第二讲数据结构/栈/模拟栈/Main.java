package 第二讲数据结构.栈.模拟栈;

import java.util.Scanner;

/**
 * 实现一个栈，栈初始为空，支持四种操作：
 *
 * push x – 向栈顶插入一个数 x
 * ；
 * pop – 从栈顶弹出一个数；
 * empty – 判断栈是否为空；
 * query – 查询栈顶元素。
 * 现在要对栈进行 M
 *  个操作，其中的每个操作 3
 *  和操作 4
 *  都要输出相应的结果。
 *
 * 输入格式
 * 第一行包含整数 M
 * ，表示操作次数。
 *
 * 接下来 M
 *  行，每行包含一个操作命令，操作命令为 push x，pop，empty，query 中的一种。
 *
 * 输出格式
 * 对于每个 empty 和 query 操作都要输出一个查询结果，每个结果占一行。
 *
 * 其中，empty 操作的查询结果为 YES 或 NO，query 操作的查询结果为一个整数，表示栈顶元素的值。
 *
 * 数据范围
 * 1≤M≤100000
 * ,
 * 1≤x≤109
 *
 * 所有操作保证合法。
 *
 * 输入样例：
 * 10
 * push 5
 * query
 * push 6
 * pop
 * query
 * pop
 * empty
 * push 4
 * query
 * empty
 * 输出样例：
 * 5
 * 5
 * YES
 * 4
 * NO
 */

//数组模拟
public class Main {

    public static int N = (int) 1e5 + 10, top = 0;
    public static int[] stack = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        while (m-- > 0){
            String op = sc.next();
            if ("push".equals(op)){
                int x = sc.nextInt();
                push(x);
            }else if ("pop".equals(op)){
                pop();
            }else if ("empty".equals(op)){
                System.out.println(isEmpty());
            }else {
                System.out.println(query());
            }
        }
        sc.close();
    }

    public static void push(int x){
        stack[++top] = x;
    }

    public static void pop(){
        top--;
    }

    public static String isEmpty(){
        return top == 0 ? "YES" : "NO";
    }

    public static int query(){
        return stack[top];
    }
}

//stack模拟 API模拟
/*
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if("push".equals(s)){
                int x = sc.nextInt();
                stk.push(x);
            } else if ("pop".equals(s)) {
                stk.pop();
            } else if ("empty".equals(s)) {
               if(stk.empty()) System.out.println("YES");
               else System.out.println("NO");
            }else ("query".equals(s)){
                System.out.println(stk.peek());
            }
        }
    }
}

 */