package DataStructures.Array.Exercises;

import java.util.ArrayList;
import java.util.List;

public class MinimalOperations {
    /*
     * For each word in a list of words, if any two adjacent characters are equal,
     * change one of them. Determine the minimum number of substitutions so the
     * final string contains no adjacent equal characters.
     * 
     * Example
     * 
     * words = ['add', 'boook', 'break']
     * 
     * 1. 'add': change one d (1 change)
     * 
     * 2. 'boook': change the middle o (1 change)
     * 
     * 3. 'break': no changes are necessary (0 changes)
     * 
     * The return array is [1,1,0].
     */

    public static List<Integer> minimalOperations(List<String> words) {
        List<Integer> operations = new ArrayList<>();

        for (String word : words) {
            int substitutions = 0;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(i - 1)) {
                    substitutions++;
                }
            }
            operations.add(substitutions);
        }

        return operations;
    }

    public static void main(String[] args) {
        List<String> words = List.of("add", "boook", "break");
        List<Integer> operations = minimalOperations(words);
        System.out.println(operations);
    }
}
