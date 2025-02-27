/*
 Let's say you have the string "banana" and you want to replace all occurrences of the character 'a' with 'o'.
 output: bonono 
*/

public class CharacterReplacer {
    public static void main(String[] args) {
        CharacterReplacer replacer = new CharacterReplacer();
        
        String inputString = "hello world";
        char c1 = 'o';
        char c2 = 'x';
        
        String result = replacer.replaceCharacter(inputString, c1, c2);
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + result);
    }
    
    public String replaceCharacter(String inputString, char c1, char c2) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : inputString.toCharArray()) {
            if (ch == c1) {
                result.append(c2);
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}