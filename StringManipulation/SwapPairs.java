public class SwapPairs {
    public String swapPairs(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 < s.length()) { // Check if there's a next character
                char ch = s.charAt(i);
                char ch2 = s.charAt(i + 1);
                result.append(ch2);
                result.append(ch);
            } else { 
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        SwapPairs solution = new SwapPairs();
        String s1 = "abcdfe";
        String s2 = "abcde";
        String s3 = "abcdef";

        System.out.println(solution.swapPairs(s1)); // Output: badcef
        System.out.println(solution.swapPairs(s2)); // Output: badce
        System.out.println(solution.swapPairs(s3)); //Output: badcfe
    }
}
