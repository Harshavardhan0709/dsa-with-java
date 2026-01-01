public class SmallestElement {
    public static int getFirstSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { -1, 2, 3, 4, 10, 67, 19, -10 };
        int numbers2[] = { -10, 0, -30, -35};
        int numbers3[] = { -10, -30, -35,-100};
        System.out.println("Smallest number in array is: " + getFirstSmallest(numbers));
        System.out.println("Smallest number in array is: " + getFirstSmallest(numbers2));
        System.out.println("Smallest number in array is: " + getFirstSmallest(numbers3));
    }
}
