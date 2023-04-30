package 第四章.数学知识.质数;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int m =Integer.parseInt(in.nextLine());
            for (int j = 1; j <=m/j ; j++) {
                if (m % j ==0) {
                    list.add(j);
                    if (j!=m/j) list.add(m/j);
                }
                list.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1-o2;
                    }
                });
            }

            for (Integer e:list) {
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
