package 第一讲基础算法.高精度.减法;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger(in.readLine());
        BigInteger b = new BigInteger(in.readLine());

        BigInteger c= a.subtract(b);
        System.out.println(c);
    }
}
