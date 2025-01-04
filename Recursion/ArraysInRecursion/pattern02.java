package DevOps_dir.Recursion.ArraysInRecursion;

public class pattern02 {
    public static void main(String[] args) {
        star02(4, 0);
    }
    static void star02(int r,int c){
        if(r==0){
            return;
        }
        //base condition
        if(c<r){
            star02(r, c+1);
            System.out.print("* ");
        }else{
            star02(r-1, 0);
            System.out.println();

        }
    }
}
