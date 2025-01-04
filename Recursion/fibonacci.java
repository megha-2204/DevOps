package DevOps_dir.Recursion;

public class fibonacci {
    public static void main(String[] args) {
        //find 8th fibonacci number
        System.out.println(fib(3));
    }
    static int fib(int n){

        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
