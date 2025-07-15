package Recurssion.Basics;

public class level1B {
    //print 1 2 3 4 5  using recursion
    
    public static void main(String[] args) {
        numb(5);
    }
    static void numb(int n){
        if(n==0){
            return;
        }


        numb(n-1);
        System.out.println(n);
    }
}
