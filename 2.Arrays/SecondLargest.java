public class SecondLargest {
    public static int getSecondLargest(int numbers[]) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstLargest) {
                secondLargest=firstLargest;
                firstLargest = numbers[i];
            }else if(numbers[i]>secondLargest && numbers[i]!=firstLargest) //checking for duplicates
                {
                secondLargest=numbers[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int numbers[] = { -1, 2, 3, 4, 10, 67,67, 19, -10 };
        int numbers2[] = { -10, 0, -30, -35};
        int numbers3[] = { -10, -30, -35};
        System.out.println("Largest number in array is: " + getSecondLargest(numbers));
        System.out.println("Largest number in array is: " + getSecondLargest(numbers2));
        System.out.println("Largest number in array is: " + getSecondLargest(numbers3));
    }
}

