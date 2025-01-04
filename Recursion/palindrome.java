package DevOps_dir.Recursion;

public class palindrome {
    public static void main(String[] args) {
        if(palinNum(121)==true){
        System.out.println("This number is palindrome" );
        }else{
            System.out.println("Not palindrome");
        }
    }
    
    static boolean palinNum(int n){

        if(n == reverse(n)){
            return true;
        }else{
        return false;
        }
    }

    static int sum =0;
    static int reverse(int n){
        if(n/10==n){
            return n;
        }
        int rem = (n%10);
        sum = (sum*10)+rem;
        reverse(n/10);
        return sum;
    }
    
}
