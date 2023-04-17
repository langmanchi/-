package 第一讲基础算法.高精度.加法;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//下标0存个位   标一存十位   大整数的存储
//数组的末尾添加一个数  处理进位  模拟人工的加法
//落实到代码当中，分析
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String m =in.next();
        String n = in.next();

        //不用利用数组来存，使用三元表达式同时处理
        int a = m.length()-1;
        int b = n.length()-1;

        //计算需要进行处理的位数  max（a，b》+1
        int x = Math.max(a,b)+1;
        int cur = 0;  //对应进位的处理分析
        while (x-->0){
            int q = a<0? 0:m.charAt(a)-'0';
            int p = b<0? 0:n.charAt(b)-'0';
            int sum = p+q+cur;
            list.add(sum%10);
            cur=sum/10;
            a--;
            b--;
        }

        //最后一步的进位进行处理
        if (cur!=0) list.add(1);
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i));
        }
    }
}
