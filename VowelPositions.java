/*Write a function that takes a string s, iterates through it, 
and collects all 0-based positions of vowels in it to a list.
Note that you should not use any Java built-in string methods 
to solve this task.For example, System.out.println(new Solution().solution("Hello WORLD")); 
should output [1, 4, 7]. Here, 'e' is a vowel, and its position
in the string "Hello" is 1. 'o' is also a vowel, and its position is 4. 
The last vowel is O at position 7.*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(String s) {
        List<Integer> vowelPositions = new ArrayList<>();
        String vowels = "aeiouAEIOU"; // Define the vowels (both lowercase and uppercase)

        // Iterate through the string character by character
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i); // Get the character at the current index
            // Check if the current character is a vowel
            for (int j = 0; j < vowels.length(); j++) {
                if (currentChar == vowels.charAt(j)) {
                    vowelPositions.add(i); // Add the index to the list if it's a vowel
                    break; // No need to check further if we found a match
                }
            }
        }
        return vowelPositions; // Return the list of vowel positions
    }
}