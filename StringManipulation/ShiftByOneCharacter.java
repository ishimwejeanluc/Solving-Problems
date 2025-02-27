/*
  Sure! Let's take the string "Hello, World!" as an example:

H becomes I
e becomes f
l becomes m
l becomes m
o becomes p
, remains , (since it's not a letter)
(space) remains (since it's not a letter)
W becomes X
o becomes p
r becomes s
l becomes m
d becomes e
! remains ! (since it's not a letter)
So, "Hello, World!" would be transformed to "Ifmmp, Xpsme!"
 */


public class ShiftByOneCharacter {
    public static String shiftString(String s) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string concatenation
        
        for (int i = 0; i < s.length(); i++) {
            char charAtI = s.charAt(i); // Get the character at index i
            
            if (charAtI >= 'a' && charAtI <= 'z') { // Check if it's a lowercase letter
                if (charAtI == 'z') {
                    result.append('a'); // Wrap around for 'z'
                } else {
                    result.append((char) (charAtI + 1)); // Shift to the next letter
                }
            } else if (charAtI >= 'A' && charAtI <= 'Z') { // Check if it's an uppercase letter
                if (charAtI == 'Z') {
                    result.append('A'); // Wrap around for 'Z'
                } else {
                    result.append((char) (charAtI + 1)); // Shift to the next letter
                }
            } else {
                result.append(charAtI); // Non-letter characters remain unchanged
            }
        }
        
        return result.toString(); // Convert StringBuilder to String and return
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String outputString = shiftString(inputString);
        System.out.println(outputString); // Output: Ifmmp, Xpsme!
    }
}