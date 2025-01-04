package DevOps_dir;

public class numberStepsLC {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
    static int count =0;
    public static int numberOfSteps(int n) {
        while(n!=0){
            if(n%2==0){
                numberOfSteps(n/2);
            }
            else{
                numberOfSteps(n-1);
            }
            count++;
        }
        return count;
    }    
    
}

