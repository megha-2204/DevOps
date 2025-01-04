package DevOps_dir.Recursion;

public class prodDigits {
    public static void main(String[] args) {
        System.out.println(prodDig(123));
    }
    static int prodDig(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * (prodDig(n/10));
    }
}
