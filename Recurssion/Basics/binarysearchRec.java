package Recurssion.Basics;

public class binarysearchRec {

    public static void main(String[] args) {
        int[] a={3,5,6,9,10,11,15};
        int target=15;
        System.out.println(bin(a,target,0,a.length-1));
    }
    static int bin(int[] a, int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid= start + (end-start)/2;
        if(a[mid]==target){
            return mid;
        }
        if(target<a[mid]){
            return bin(a,target,start,mid-1);
        }
        return bin(a,target,mid+1,end);
    }
}
