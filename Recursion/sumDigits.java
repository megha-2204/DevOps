package DevOps_dir.Recursion;

public class sumDigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits: "+sumDig(123));
    }
    static int sumDig(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) +sumDig(n/10);

    }
}
