public class BuyAndSellStock {
    public static int maxProfit(int nums[]){
        int min=Integer.MAX_VALUE;
        int maxProfitValue=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min, nums[i]);
            maxProfitValue=Math.max(maxProfitValue, nums[i]-min);
        }
        return maxProfitValue;
    }
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        int nums2[]={6,5,4,3,2,1};
        System.out.println(maxProfit(nums));
        System.out.println(maxProfit(nums2));
    }
}
