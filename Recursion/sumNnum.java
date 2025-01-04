package DevOps_dir.Recursion;

public class sumNnum {
    public static void main(String[] args) {
        System.out.println("Sum of n number using recursion: "+sum(5));
    }
    static int sum(int n){
        if(n<=0){
            return n;
        }
        return n + sum(n-1);
    }
    
}
