package DevOps_dir.Leetcode.Arrays;

public class maxPopulationYear {
        public static int maximumPopulation(int[][] logs) {
            
        int[] year = new int[101];
		// O(n) -> n is log.length

        for(int[] log : logs){
            year[log[0] - 1950]++;
            year[log[1] - 1950]--;
        }
        
        int maxNum = year[0], maxYear = 1950;

        for(int i = 1; i < year.length; i++){
            year[i] += year[i - 1];  // Generating Prefix Sum
            if(year[i] > maxNum){
                maxNum = year[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
        }

        public static void main(String[] args) {
            int[][] log = {{1950,1961},{1960,1971},{1970,1981}};
            System.out.println(maximumPopulation(log));
        }
    
}
