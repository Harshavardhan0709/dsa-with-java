
//Time complexity-O(n)
//Space complexity -O(1)

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[x]) {
                x = x + 1;
                nums[x] = nums[i];
            }
        }
        return x + 1;
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
