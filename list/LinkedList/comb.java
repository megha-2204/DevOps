import java.util.ArrayList;
import java.util.List;

public class comb {

    public static void main(String[] args) {

        
        // Input array
        String[] array = {"Mon", "Tues", "Wed", "Thurs","Fri","Sat","Sun"};
        int combinationLength = 1;

        // Generate combinations
        List<List<String>> combinations = generateCombinations(array, combinationLength);

        // Print combinations
        for (List<String> combination : combinations) {
            System.out.println(combination);
        }
    }

    // Method to generate combinations
    public static List<List<String>> generateCombinations(String[] array, int combinationLength) {
        List<List<String>> result = new ArrayList<>();
        generateCombinations(array, combinationLength, 0, new ArrayList<>(), result);
        return result;
    }

    // Recursive method to generate combinations
    private static void generateCombinations(String[] array, int combinationLength, int start,
                                              List<String> current, List<List<String>> result) {
        // Base case: if the current combination has reached the desired length
        if (current.size() == combinationLength) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Recursive case: try all possible elements to complete the combination
        for (int i = start; i < array.length; i++) {
            current.add(array[i]);
            generateCombinations(array, combinationLength, i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }

}
