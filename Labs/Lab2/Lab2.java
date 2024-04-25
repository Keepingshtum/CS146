public class static void main(Anagram[] args) {
    s = new String("fired");
    t = new String("fried");
    sortChars(s,t);
    isAnagram(s,t);
})
private static void sortChars() {
    char[] charArray = s.toCharArray();
    Arrays.sort(charArray);
    String sortedS = new String(charArray);
    char[] charArray2 = t.toCharArray();
    Arrays.sort(charArray);
    String sortedT = new string(charArray);
}
private static void isAnagram() {
    if (sortedS = sortedT){
        System.out.println("These two words are anagrams.");
    }
    else System.out.println("These two words are NOT anagrams.");
}
