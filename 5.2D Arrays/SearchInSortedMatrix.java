public class SearchInSortedMatrix {

    // Time Complexity:O(n*m)
    // Space Complexity:O(1)
    // public static boolean searchBrute(int matrix[][], int target) {
    // int n = matrix.length;
    // int m = matrix[0].length;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (matrix[i][j] == target) {
    // System.out.println("found at (" + i + "," + j + ")");
    // return true;
    // }
    // }
    // }
    // System.out.println("Not found");
    // return false;
    // }

    // // Time Complexity:O(nlogm)
    // // Space Complexity:O(1)
    // public static boolean rowWiseBinarySearch(int matrix[][], int target) {
    // int n = matrix.length;
    // int m = matrix[0].length;
    // for (int i = 0; i < n; i++) {
    // int low = 0, high = m - 1;
    // while (low <= high) {
    // int mid = (low + high) / 2;
    // if (matrix[i][mid] == target) {
    // System.out.println("found at (" + i + "," + mid + ")");
    // return true;
    // } else if (matrix[i][mid] > target) {
    // high = mid - 1;
    // } else {
    // low = mid + 1;
    // }
    // }
    // }
    // System.out.println("Not found");
    // return false;
    // }

    // Time Complexity:O(mlogn)
    // Space Complexity:O(1)
    // public static boolean colWiseBinarySearch(int matrix[][], int target) {
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     for (int j = 0; j < m; j++) {
    //         int low = 0, high = n - 1;
    //         while (low <= high) {
    //             int mid = (low + high) / 2;
    //             if (matrix[j][mid] == target) {
    //                 System.out.println("found at (" + j + "," + mid + ")");
    //                 return true;
    //             } else if (matrix[j][mid] > target) {
    //                 high = mid - 1;
    //             } else {
    //                 low = mid + 1;
    //             }
    //         }
    //     }
    //     System.out.println("Not found");
    //     return false;
    // }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        // searchBrute(arr, 33);
        // searchBrute(arr, 3);
        // rowWiseBinarySearch(arr, 33);
        // rowWiseBinarySearch(arr, 3);
        // colWiseBinarySearch(arr, 33);
        // colWiseBinarySearch(arr, 3);
    }
}
