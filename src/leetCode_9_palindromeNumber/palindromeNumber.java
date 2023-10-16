package leetCode_9_palindromeNumber;

public class palindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert to String
        int n = s.length();

        for (int i=0; i<n/2; i++) {

            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        return true;
    }
}
