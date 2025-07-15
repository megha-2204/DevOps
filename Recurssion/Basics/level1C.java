package Recurssion.Basics;

public class level1C {

    //factorial of a number in recursion
    //5! = 5*4*3*2*1 = 120 
    public static void main(String[] args) {
        System.out.print(fact(5));

    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
