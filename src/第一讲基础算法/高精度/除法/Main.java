package 第一讲基础算法.高精度.除法;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//高精度函数的使用
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        BigInteger m = new BigInteger(a);
        BigInteger n = new BigInteger(b);

        //divide返回a/b  这个方法返回除数 以及余数
        BigInteger[] c = m.divideAndRemainder(n);

        System.out.println(c[0]);
        System.out.println(c[1]);

    }
}
