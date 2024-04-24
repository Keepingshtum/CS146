package hw8;

import java.util.ArrayList;
import java.util.HashMap;

public class hw8 {
    public static int longestPalindrome(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        alphabet += alphabet.toUpperCase();
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetter(c)){
                if (!charCounts.containsKey(c)) {
                    charCounts.put(c, 1);
                }else{
                    charCounts.replace(c, charCounts.get(c) + 1);
                }
            }
        }
        StringBuilder output = new StringBuilder();
        boolean hasSingle = false;
        for (int i = 0; i < alphabet.length(); i++){
            if (charCounts.containsKey(alphabet.charAt(i))) {
                int pairCount = charCounts.get(alphabet.charAt(i)) / 2;
                String repeat = String.valueOf(alphabet.charAt(i)).repeat(pairCount);
                output.insert(0, repeat);
                output.append(repeat);
                if (!hasSingle && charCounts.get(alphabet.charAt(i)) % 2 == 1) {
                    output.insert(output.length() / 2, alphabet.charAt(i));
                    hasSingle = true;
                }
            }
        }

        System.out.println(output);
        return output.length();
    }

    public static void main(String[] args) {
        String s1 = "speediskey";

        System.out.println(longestPalindrome(s1));
    }
}

