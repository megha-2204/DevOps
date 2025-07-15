import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,12};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        //else, take the middle element and split it into two
        int mid = arr.length /2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second){
        //you will compare each element from first array and second array
        int[] mix = new int[first.length + second.length];
        //first array pointer
        int i=0;
        //second array pointer
        int j=0;
        ////final array pointer
        int k=0;
        while(i < first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //it may be possible for one of the array to not complete, but already sorted in mergeSort() 
        //just add the remaining element at last of the mix[]
        //that is, when one of the array is empty put it in the last
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
    }
}
