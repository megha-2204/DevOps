package DevOps_dir.Recursion.ArraysInRecursion;

public class pattern01 {
    public static void main(String[] args) {
        star1(5, 0);
    }

    static void star1(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            star1(r, c+1);
        }else{
            System.out.println();
            star1(r-1,0);
        }
        
    }
}
