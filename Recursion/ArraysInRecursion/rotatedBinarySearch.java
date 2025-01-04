package DevOps_dir.Recursion.ArraysInRecursion;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={7,8,1,2,3,4,5};
        System.out.println(search(arr, 4, 0, arr.length-1));

    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            //first half is sorted
            //2 cases - either target present else not
            if(target >= arr[s] && target<=arr[m]){
                //first half is sorted, target present
                search(arr, target, s, m-1);
            }else{
                search(arr, target, m+1, e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }
}
