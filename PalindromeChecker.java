public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        // Step 1: Create an array to hold the filtered characters
        char[] filteredChars = new char[input.length()];
        int index = 0;

        // Step 2: Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if the character is a letter
            if (isLetter(currentChar)) {
                // Normalize the case (convert to lowercase)
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    // Convert uppercase to lowercase by adjusting ASCII value
                    currentChar = (char) (currentChar + 32);
                }
                // Add the normalized character to the filtered array
                filteredChars[index] = currentChar;
                index++;
            }
        }

        // Step 3: Check if the filtered characters form a palindrome
        int leftIndex = 0;
        int rightIndex = index - 1;

        while (leftIndex < rightIndex) {
            if (filteredChars[leftIndex] != filteredChars[rightIndex]) {
                return false; // Not a palindrome
            }
            leftIndex++;
            rightIndex--;
        }

        return true; // It is a palindrome
    }

    // Helper method to check if a character is a letter
    private static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static void main(String[] args) {
        String testString = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(testString);
        System.out.println("Is the string a palindrome? " + result);
    }
}