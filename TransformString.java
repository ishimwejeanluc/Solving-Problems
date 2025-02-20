/*
 Given a string inputString, your task is to write a method that transforms all the lowercase letters to uppercase and all the uppercase letters to lowercase. If the character is not a letter, do not transform it.

The transformation should be done without using any built-in Java methods like toLowerCase(), toUpperCase(), or similar in your code.

For example, for the input string "HelLo WoRld 123", the output should be "hELlO wOrLD 123".
 */


public class TransformString{

public String transformString(String inputString) {
    StringBuilder result = new StringBuilder();
    
    for( char ch : inputString.toCharArray()){
     if( ch >= 'A' && ch <= 'Z' ){
         result.append((char)(ch + 32));
     }
     else if(ch >= 'a' && ch <= 'z'){
          result.append((char)(ch - 32));
     }
     else{
         result.append(ch);
     }
    }
     return result.toString();
 }
 public static void main(String[] args) {
    String input = "Hello World!";
    String output = convertCase(input);
    System.out.println(output);  // hELLO wORLD!
}
}