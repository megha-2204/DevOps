package Recurssion.Basics;

//count number of zeros in a number : 30204 -> 2
public class level1H {

    static int count =0;
    public static void main(String[] args) {
        System.out.println(countZero(400003001));
    }
    static int countZero(int n){
        if(n==0){
            return 0;
        }
        if(n%10==0){
            count++;
        }
        countZero(n/10);
        
        return count;
    }
}
