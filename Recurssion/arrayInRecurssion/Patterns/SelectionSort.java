import java.util.Arrays;

public class SelectionSort {
    //selection sort is taking the largest element in the a
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1};
        int r=arr.length-1, c=0;
        select(arr, r, c,0);
        System.out.println(Arrays.toString(arr));
    }
    static void select(int[] arr, int r, int c,int max){
       if(r==0){
        return;
       }
       if(c<r){
        //find the biggest element and add it to the last
        if(arr[c]>arr[max]){
            arr[max]=arr[c];
            select(arr, r, c+1, c);
        }else{
            select(arr, r, c+1, max);
        }
        
       }else{
            int temp = arr[r];
            arr[r]=max;
            arr[max]=temp;
            
            select(arr, r-1, 0, max);
       }
       
    }
}
