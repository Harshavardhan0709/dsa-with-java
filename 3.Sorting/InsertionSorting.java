public class InsertionSorting{

    public static void sortArray(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int curr = a[i];
            int prev = i - 1;
            while (prev >= 0 && a[prev] > curr) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int nums[] = {5,4,2,1,3};
        sortArray(nums);
        for (int a : nums) {
            System.out.print(a + " ");
        }
    }

}