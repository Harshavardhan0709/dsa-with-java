public class ReverseStringChar {
    public static void reverse(char[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        char[] arr = { 'h', 'e', 'l', 'l', 'o' };
        char[] arr2 = { 'o', 'l', 'l', 'e', 'h' };
        reverse(arr);
        reverse(arr2);

    }
}
