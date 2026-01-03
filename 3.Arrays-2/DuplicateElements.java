
//Time Complexity  : O(n^2)
//Space Complexity : O(1)

public class DuplicateElements {
    public static void printDuplicateElements(int[] numbers) {
        int length = numbers.length;
        int flag = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[i] == numbers[j]) {
                    flag = 1;
                    System.out.println("Duplicate Elements are:" + numbers[i]);
                }
            }
        }
        if (flag == 0) {
            System.out.println("No duplicate elements found");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 6, 6 };
        int arr1[] = { 1, 2, 3, 4, 5 };
        printDuplicateElements(arr);
        printDuplicateElements(arr1);
    }
}
