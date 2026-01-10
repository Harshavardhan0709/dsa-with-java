public class LinearSearchIn2D {
    public static boolean search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(matrix[i][j]+"found at cell " + "(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                search(arr, arr[i][j]);
            }
        }
        
    }
}
