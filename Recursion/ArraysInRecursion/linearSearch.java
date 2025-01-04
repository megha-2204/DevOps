package DevOps_dir.Recursion.ArraysInRecursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,7};
        System.out.println(search(arr, 17, 0)); 
        System.out.println(findIndex(arr, 1, 0));

    }
    static boolean search(int[] arr, int target, int i){
        if(i==arr.length){
            return false;
        }
        return target==arr[i] || search(arr, target, i+1);
        
    }
    static int findIndex(int[] arr, int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }else{
            return findIndex(arr, target, i+1);
        }

    }
}
