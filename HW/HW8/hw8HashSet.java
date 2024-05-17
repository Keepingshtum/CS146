package HW.HW8;

import java.util.HashSet;

public class hw8HashSet {
     public int longestPalindrome(String s) {
        if( s == null || s.length() == 0 ) { return 0;}
        HashSet<Character> HS = new HashSet<Character>();
        int count = 0;
        for(int i = 0 ; i< s.length(); i ++){
            if(HS.contains(s.charAt(i))){
                HS.remove(s.charAt(i)); 
                //if the hashset already has this charcter, it is a duplicate
                //increment count and remove it from the hashset 
                //(removing it helps incase there are 3+ , it would reset the duplicate)
                count++;
            }
            else { //otherwise add it into the hashset
                HS.add(s.charAt(i));
            }
        }
        if(!HS.isEmpty()) {
            return count*2+1;
            //if the hashset isn't empty, there is a lone character
            //or there are letters that have no duplicates
            //which we can add onto the palindrome by its property
        }
        else{
            //otherwisr just *2 and dont add the one
            return count*2;
        }
    }

    public static void main(String[] args) {
        hw8 test = new hw8();
        String p1 = "abccccdd" ; //expeted output 7
        String p2 = "speediskey";  //expected output 5
        String p3 = "abccccdddz";
        String p4 = "";
        System.out.println(test.longestPalindrome(p1));
        System.out.println(test.longestPalindrome(p2));
        System.out.println(test.longestPalindrome(p3));
        System.out.println(test.longestPalindrome(p4));
    }
}
