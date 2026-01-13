public class Palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("Not a Palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }

    public static void main(String[] args) {
        String str = "Racecar";
        String str1 = "noon";
        String str2 = "harsha";
        isPalindrome(str.toLowerCase());
        isPalindrome(str1.toLowerCase());
        isPalindrome(str2.toLowerCase());
    }
}
