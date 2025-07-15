import java.util.ArrayList;
import java.util.List;

public class eg{
     public static void main(String[] args) {
        String str = "MEGHA";
        int length = 3;
        List<String> result = getCombinations(str, length);
        for (String combination : result) {
            System.out.println(combination);
        }
    }

    public static List<String> getCombinations(String str, int length) {
        List<String> combinations = new ArrayList<>();
        generateCombinations(str, "", length, 0, combinations);
        return combinations;
    }

    private static void generateCombinations(String str, String prefix, int length, int start, List<String> combinations) {
        if (prefix.length() == length) {
            combinations.add(prefix);
            return;
        }
        for (int i = start; i < str.length(); i++) {
            generateCombinations(str, prefix + str.charAt(i), length, i + 1, combinations);
        }
    }
}