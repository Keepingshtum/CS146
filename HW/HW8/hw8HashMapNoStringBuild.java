import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int longestPalindrome(String s) {
        int longest = 0;
        int largestOddCount = 0;
        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (counts.containsKey(s.charAt(i)))
                counts.put(s.charAt(i), counts.get(s.charAt(i)) + 1);
            else
                counts.put(s.charAt(i), 1);
        }
        for (Map.Entry<Character, Integer> letter: counts.entrySet()) {
            if (letter.getValue() % 2 == 0) {
                longest += letter.getValue();
            } else {
                if (letter.getValue() > largestOddCount)
                    largestOddCount = letter.getValue();
            }
        }
        longest += largestOddCount;
        return longest;
    }


    public static void main(String[] args) {
        
    }
}
