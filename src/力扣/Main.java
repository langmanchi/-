package 力扣;

public class Main {
    public static void main(String[] args) {

    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
//    public TreeNode replaceValueInTree(TreeNode root) {
//
//    }


























    public static long[] findPrefixScore(int[] nums) {
        //先求出转换数组，之后再进行数组的求和  用一个值更新max
        long[] cover = new long[nums.length];
        long[] target = new long[nums.length];
        int sum =0;
        int max = 0; //均是大于0的，可以标记
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
            }
            cover[i] = nums[i]+max;
            sum+=cover[i];
            target[i] = sum;
        }
        return target;
    }






























    public static int[] findColumnWidth(int[][] grid) {

        int[] a = new int[grid[0].length];

        //处理的是一列
        for (int j = 0; j < grid[0].length; j++) {
            int max = 0;
            for (int i = 0; i < grid.length; i++) {
                String s = String.valueOf(grid[i][j]);
                if (s.length()>max){
                    max = s.length();
                }
            }
            a[j] = max;
        }
        return a;
    }
}
