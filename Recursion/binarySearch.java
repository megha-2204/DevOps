package DevOps_dir.Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,12,18,20,21,23};
        System.out.println(search(arr, 21,0,arr.length-1));
    }
    static int search(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            //lies in left side
            start = 0; end = mid-1;
            return search(arr, target,start,end);
        }

            //lies in right side
            return search(arr, target, mid+1, end);


    }
    
}
