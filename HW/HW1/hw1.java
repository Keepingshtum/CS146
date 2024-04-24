package hw1;

public class hw1 {
    private static boolean palindrome(String s){
        for (int i = 0; i < (int)(s.length()/2); i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("bass bsab")?"palindrome":"not palindrome");
    }
}