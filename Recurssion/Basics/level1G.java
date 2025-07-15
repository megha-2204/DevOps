package Recurssion.Basics;

public class level1G {

    //reverse a number
    //n=1872 o/p->  2781 
    static int sum =0 ;
    public static void main(String[] args) {
        int n = 1842;
        rev(n);
        System.out.println(sum);
    }
    static void rev(int n){
        if(n==0){
            return;
        }
        int rem = (n%10);
        sum = (sum*10) + rem;
        rev(n/10);

    }
}
