package DevOps_dir.Recursion;

public class numbers {
    public static void main(String[] args) {
        num(5);
    }
    static void num(int n){
        if(n>0){
            num(n-1);
            System.out.println(n);
            
        }
        
        
    }
}
