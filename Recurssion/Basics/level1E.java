package Recurssion.Basics;

public class level1E {
//sum of digits in recursion
//product of digits in recursion

    public static void main(String[] args) {
        System.out.println(sumDig(1342));
        System.out.println(prodDig(1342));
    }
    static int sumDig(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumDig(n/10);
    }
    static int prodDig(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*prodDig(n/10);
    }
}
