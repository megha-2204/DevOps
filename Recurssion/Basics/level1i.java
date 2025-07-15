package Recurssion.Basics;

public class level1i {

    //n=14
    //even -> divide by 2; 
    //odd -> subtract by 1;
    //14/2=7 (1)
    //7-1=6 (2)
    //6/2=3 (3)
    //3-1 = 2 (4)
    //2/2=1 (5)
    //1-1 = 0 (6)  -> return 6

    static int count=0;
    public static void main(String[] args) {
        System.out.println(countSteps(14));
    }
    static int countSteps(int n){
        if(n/10==n){
            return n;
        }
        if(n%2==0){
            countSteps(n/2);
            count++;
        }
        if(n%2!=0){
            countSteps(n-1);
            count++;
        }
        return count;

    }
}
