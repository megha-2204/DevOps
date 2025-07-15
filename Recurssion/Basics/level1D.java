package Recurssion.Basics;

public class level1D {

    //sum of n numbers -> 5 -> 1+2+3+4+5 = 15 in recursion
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
