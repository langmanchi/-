package 第二讲数据结构.单链表;

public class Main {
    static int[] e = new int[100010];
    static int[] ne = new int[100010];
    static int idx,head;

    public static void init(){
        idx = 0;
        head = -1;
    }

    //H向练表头插入一个数x



    //l在第k位数后面插入一个数x
    public static void add(int k,int x){
        e[idx] = x;
        ne[idx] = ne[k];

    }

}
