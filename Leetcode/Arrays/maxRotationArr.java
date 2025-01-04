package DevOps_dir.Leetcode.Arrays;

public class maxRotationArr {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        if(findRotation(mat,target)){
            System.out.println("The matrix is the same after rotating 90 degrees");
        }
    }
    
    static boolean findRotation(int[][] mat, int[][] target){
        return true;

        
    }
}
