import java.util.Arrays;

public class InplaceMSort {
    //in-place merge sort using recursion
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInplace(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }
        int mid=(start+end)/2;
        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid, end);

        merge(arr,start,mid,end);
    }
    private static int[] merge(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        //it may be possible to one array to end soon, apo will put the remaining elements at last, as they all will be sorted
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
        return mix;
    }
}
