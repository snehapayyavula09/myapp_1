public class PalindromeChecker {
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            // Ignore non-alphanumeric characters and case
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) right--;
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
       
