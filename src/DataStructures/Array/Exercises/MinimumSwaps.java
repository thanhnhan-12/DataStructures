package DataStructures.Array.Exercises;

import java.util.Stack;

public class MinimumSwaps {
    /*
     * A balanced sequence of parentheses is one in which every opening bracket has
     * a corresponding closing bracket to it. More formally, a sequence of
     * parantheses is considered balanced if it can be represented in the form
     * s1(s2) where both s1 and s2 are either empty or balanced strings.
     * 
     * Given a sequence of parentheses, find the minimum number of swaps needed to
     * make the sequence balanced. It is not necessary to swap adjacent characters
     * only. If it is impossible to balance the string, return -1.
     * 
     * 2
     * 
     * 3
     * 
     * 4
     * 
     * Example
     * 
     * brackets = ")()((0)"
     * 
     * Swap the characters at the first and last index to get "((((()))" which is
     * balanced. The string can be balanced with1 swap.
     * 
     */

     public static int minimumSwaps(String brackets) {
        int openCount = 0;
        int swaps = 0;
        Stack<Integer> openIndices = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char currentChar = brackets.charAt(i);

            if (currentChar == '(') {
                openCount++;
                openIndices.push(i);
            } else {
                if (openCount > 0) {
                    openIndices.pop();
                    openCount--;
                } else {
                    swaps++;
                }
            }
        }

        // The number of opening parentheses cannot be equal to the number of closing parentheses
        if (openCount != 0) {
            return -1;
        }

        swaps += openIndices.size(); // number of opening brackets needs to be swapped

        return swaps;
    }

    public static void main(String[] args) {
        String brackets = ")())(((0)";
        int minimumSwaps = minimumSwaps(brackets);
        System.out.println(minimumSwaps); // Output: 1
    }

}
