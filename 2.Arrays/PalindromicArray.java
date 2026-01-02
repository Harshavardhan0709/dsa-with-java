public class PalindromicArray {
    public static boolean checkPalindrome(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i <= n / 2; i++) {
            if (numbers[i] != numbers[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 3, 2, 1 };
        int[] numbers2 = { 1, 2, 3, 3, 2, 3 };

        System.out.println(checkPalindrome(numbers)
                ? "It is a palindromic array"
                : "Not a palindromic array");
        System.out.println(checkPalindrome(numbers2)
                ? "It is a palindromic array"
                : "Not a palindromic array");
    }
}
