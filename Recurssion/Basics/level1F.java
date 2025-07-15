package Recurssion.Basics;

public class level1F {

    //passing number
    //--n should not be used in recursion
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // fun(--n);
        // fun(n--);
        fun(n-1);
    }
}
