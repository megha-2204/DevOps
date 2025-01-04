package DevOps_dir.Leetcode.Arrays;

public class cellsWithOddvalInMatrix {
    public static void main(String[] args) {
        int ind[][] = {{0,1},{1,1}};
        System.out.println(oddCells(2,3,ind));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        
        for(int i=0;i<indices.length;i++){
            //row is constant
            for(int j=0;j<n;j++){
                ans[indices[i][0]][j]++;
            }
            //col is constant
            for(int k=0;k<m;k++){
                ans[k][indices[i][1]]++;
            }
        }

        //count odd numbers in the final matrix
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ans[i][j]%2!=0){
                    count++;
                }
            }
        } 
        return count;    
    }
}
