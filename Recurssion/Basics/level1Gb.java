package Recurssion.Basics;

public class level1Gb {

    static int m =0;
    public static void main(String[] args) {
        int n=1111;
        rec2(n);
        if(n==m){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("false");
        }
    }
    static int rec2(int n){
        int dig = (int)Math.log10(n)+1;
        if(dig<1){
            return 0;
        }
        m += (n%10)* (Math.pow(10, dig-1));
        dig--;
        rec2(n/10);
        return m;
    }
}
