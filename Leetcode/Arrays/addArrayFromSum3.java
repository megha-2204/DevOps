package DevOps_dir.Leetcode.Arrays;
import java.util.LinkedList;
import java.util.List;

public class addArrayFromSum3 {
    //using linkedlist
    public static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res=new LinkedList<>();
        int len=num.length-1;
        while(len>=0 || k>0){
            if(len>=0){
                k+=num[len--];
            }
            res.addFirst(k%10);
            k/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        System.out.println(addToArrayForm(num,34));

    }
}
