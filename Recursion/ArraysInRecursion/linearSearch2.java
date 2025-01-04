package DevOps_dir.Recursion.ArraysInRecursion;

import java.util.ArrayList;

public class linearSearch2 {
    //on multiple occurances
    //to find index
    public static void main(String[] args) {
        int[] arr = {3,2,1,1,18,7};
        // System.out.println(search(arr,17, 0)); 
        //findAllIndexes(arr, 1, 0);
        //System.out.println(al);
        // System.out.println(findAllIndexesWithList(arr,1,0,al));

        System.out.println(findAllIndexWithListInMethod(arr, 1, 0));
    }
    static boolean search(int[] arr, int target, int i){
        if(i==arr.length){
            return false;
        }
        return target==arr[i] || search(arr, target, i+1);
        
    }
    static ArrayList<Integer> al = new ArrayList<>();
    static void findAllIndexes(int[] arr,int target,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            al.add(i);
        }
        findAllIndexes(arr, target, i+1);   
    }
    static ArrayList<Integer> findAllIndexesWithList(int[] arr,int target,int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return findAllIndexesWithList(arr, target, i+1,list);   
    }
    //create a arraylist inside the function
    static ArrayList<Integer> findAllIndexWithListInMethod(int[] arr, int target, int i){
        ArrayList<Integer> l1 = new ArrayList<>();
        if(i==arr.length){
            return l1;
        }
        //this will contain the index of that function call only
        if(arr[i]==target){
            l1.add(i);
        };
        ArrayList<Integer> ansFromBelowCalls = findAllIndexWithListInMethod(arr, target, i+1);
        l1.addAll(ansFromBelowCalls);
        return l1;
    }
}
