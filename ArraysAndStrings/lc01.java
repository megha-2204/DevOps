package DevOps_dir.ArraysAndStrings;

import java.util.Arrays;

public class lc01 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};

        System.out.println(Arrays.toString(getConcatenation(arr)));
    }


public static int[] getConcatenation(int[] nums) {
    int[] n = new int[2* nums.length];
    for(int i=0;i<n.length;i++){
        if(i < n.length/2){
            n[i]=nums[i];
        }else{
            int j = (n.length) - i;
            n[i + j] = nums[i];
        }
    }
    return n;
}
}