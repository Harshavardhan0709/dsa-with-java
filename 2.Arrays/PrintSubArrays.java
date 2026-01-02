//Time Complexity - O(n^3)
//Space Complexity -O(1)




public class PrintSubArrays {
    public static void printSubArrays(int[] numbers) {
        int totalSubArrays = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]);
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub-array pairs: " + totalSubArrays);
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }

}
