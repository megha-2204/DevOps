package DevOps_dir.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class dynamicArray{
    public static void main(String[] args) {
        //initialize
        List<Integer> l0 = new ArrayList<>();
        List<Integer> l1;                           //l1 = null

        //cast an array to list; procedure
        Integer[] a = {0,12,23,2};
        l1 = new ArrayList<>(Arrays.asList(a));

        //makes a copy
        List<Integer> l2 = l1; 
        List<Integer> l3=new ArrayList<>(l1);       //makes a exact copy of l0 in l3

        System.out.println("The size of arraylist is " + l1.size());

        System.out.println("The first element of l1 is " + l1.get(0));

        System.out.println("[Version1] The contents of l1 are: ");
        for(int i=0;i<l1.size();i++){
            System.out.print(" " +l1.get(i));
        }
        System.out.println();

        System.out.println("[Version2] The contents of l1 are: ");
        for(int i: l1){
            System.out.print(" " +i);
        }
        System.out.println();

        l2.set(0, 322);
        System.out.println("Modified element is "+l1.get(0));
        l3.set(0, -21);
        System.out.println("Modified element is " +l1.get(0));
        
        //sort
        Collections.sort(l1);

        // 9. add new element at the end of the vector
        l1.add(-1);
        l1.add(1, 6);
        // 10. delete the last element
        l1.remove(l1.size() - 1);
        
    }
}