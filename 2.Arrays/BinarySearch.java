//Time Complexity - O(logn)
//Space Complexity -O(1)

public class BinarySearch {
    public static int binarySearch(int[] array, int key) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 10;
        int key2 = 11;
        int key3 = 4;
        int index = binarySearch(arr, key3);
        if (index != -1) {
            System.out.println("Key found at index : " + index);
        } else {
            System.out.println("Key not found");
        }

    }
}