package Recurssion.Basics;

public class level1A {

    //print 5 4 3 2 1 using recursion
    public static void main(String[] args) {
        numb(5);
    }
    static void numb(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        numb(n-1);     
    }
}
