//Time complexity-O(n)
//Space complexity -O(1)

public class KadanesAlgo {

    public static int kadanes(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < num.length; i++) {
            cs = Math.max(num[i], cs + num[i]);
            ms = Math.max(ms, cs);
        }
        return ms;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5 };
        int arr2[] = { -2, -3, -4, -5 };
        System.out.println("Maximum subarray sum is: " + kadanes(arr));
        System.out.println("Maximum subarray sum is: " + kadanes(arr2));
    }
}
