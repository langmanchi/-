package 第二讲数据结构.栈.模拟栈;

import java.util.Scanner;

public class Main1 {
    //理解算法，不要死记模板 使用数组模拟的能力
    static int N =(int)1e5+10,top =0;
    static int[] stack = new int[N];
    //对输入的巧妙处理
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            String op = in.next();
            if ("push".equals(op)){
                int x= in.nextInt();
                push(x);
            }else if ("pop".equals(op)){
                pop();
            }else if ("query".equals(op)){
                System.out.println(query());
            }else {
                System.out.println(empty());
            }
        }
    }

    public static void push(int x){
        stack[++top]=x;
    }
    public static void pop(){
        top--;
    }
    public static String empty(){
        if (top==0) return "YES";
        return "NO";
    }
    public static int query(){
       return stack[top];
    }

}
