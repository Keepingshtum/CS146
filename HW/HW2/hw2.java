package hw2;

public class hw2 {
    private static boolean isBadVersion(int i){
        return i >= 8;
        //return false;
    }

    private static int findVersion(int[] array, int n, int m){
        if (m >= n){
            int mid = (n+m)/2;
            if (isBadVersion(array[mid]) && (mid - 1 < 0 || !isBadVersion(array[mid - 1]))){
                return array[mid];
            }else if (!isBadVersion(array[mid])){
                return findVersion(array, mid + 1, m);
            }else{
                return findVersion(array, n, mid - 1);
            }
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = findVersion(array, 0, array.length - 1);
        System.out.println(result == -1?"no bad version":"version " + result);
    }
}