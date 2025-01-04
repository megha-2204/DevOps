package DevOps_dir.Recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of number : " +fact(5));
    }
    static int fact(int n){
        if(n<=1){
            return n;
        }
        return n*fact(n-1);
    }
    
}
