package DevOps_dir.Recursion;

public class reversalNum2 {
    //with helper function that returns number of digits

    public static void main(String[] args) {
        System.out.println(digCount(1234));
    }

    static int digCount(int n){
        int digits = (int) (Math.log10(n) + 1);
        return reverse2(n,digits);
    }
    static int reverse2(int n,int dig){

        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, dig-1)) + reverse2(n/10, dig-1);
    }
}
