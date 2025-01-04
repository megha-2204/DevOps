package DevOps_dir.Recursion.ArraysInRecursion;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,9,12};
        System.out.println(sorted(arr, 0));


    }
    static boolean sorted(int[] arr, int index){
        //base condition
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);

    }
    
}
