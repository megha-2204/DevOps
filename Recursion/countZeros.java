package DevOps_dir.Recursion;

public class countZeros {
    public static void main(String[] args) {
        //count number of zeros
        System.out.println(countZ(200000102));
    }
    static int count =0;
    static int countZ(int n){
        
        if(n%10==0){
            count++;
        }
        if(n/10!=0){
        countZ(n/10);
        }
        return count;
    }
    
}
