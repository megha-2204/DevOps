package Recurssion.Basics;

public class level1Ga {

    //1832 -> 2381
    //reverse of digits
    static int m =0;
    public static void main(String[] args) {
        System.out.println(rel(8321));
    }
   static int rel(int n){
        int dig = (int)Math.log10(n)+1;
        if(dig<1){
            return 10;
        }
        m += (n%10)* (Math.pow(10, dig-1));
        dig--;
        rel(n/10);
        return m;
    }
}
