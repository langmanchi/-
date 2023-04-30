package 第二讲数据结构.Trie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] str = in.readLine().split(" ");
            if (str[0].equals("I")){
                map.put(str[1],map.getOrDefault(str[1],0)+1);
            }else {
                System.out.println(map.getOrDefault(str[1],0));
            }
        }
    }
}
