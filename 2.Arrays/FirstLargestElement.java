public class FirstLargestElement {
    public static int getFirstLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { -1, 2, 3, 4, 10, 67, 19, -10 };
        int numbers2[] = { -10, 0, -30, -35};
        int numbers3[] = { -10, -30, -35};
        System.out.println("Largest number in array is: " + getFirstLargest(numbers));
        System.out.println("Largest number in array is: " + getFirstLargest(numbers2));
        System.out.println("Largest number in array is: " + getFirstLargest(numbers3));
    }
}
