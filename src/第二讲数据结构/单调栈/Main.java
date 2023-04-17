package 第二讲数据结构.单调栈;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //维护一个单调栈  具体实现的方法
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        // 先用暴力法，之后采用单调栈
        Stack<Integer> stack = new Stack<>();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = in.nextInt();
        }

        // 对数判断，大于的话直接peek栈顶，压栈
        // 小于的话弹出到满足为止，如果栈为空依旧不满足 打印-1，压入新的最小数  之后的如果小于这个也不用去前面找了
        for (int i = 0; i <m ; i++) {
            while (!stack.isEmpty()&&a[i]<=stack.peek()){
                    stack.pop();
                }
            if (stack.isEmpty()){
                System.out.print(-1+" ");
            }else {
                System.out.print(stack.peek()+" ");
            }
            stack.push(a[i]);

//            if (a[i]<=stack.peek()){
//
//                while (!stack.isEmpty()&&a[i]<=stack.peek()){
//                    stack.pop();
//                }
//                stack.push(a[i]);
//                System.out.print(-1+" ");
//            }
//            else {
//                System.out.print(stack.peek()+" ");
//                stack.push(a[i]);
//            }
        }



//        for (int i = 0; i < m; i++) {
//            int count = 0;
//            for (int j = i-1; j>=0; j--) {
//                if (j>=0&&a[j]<a[i]) {
//                    System.out.print(a[j] + " ");
//                    count++;
//                    break;
//                }
//            }
//            if (count==0) System.out.print(-1+" ");
//        }

    }
}
