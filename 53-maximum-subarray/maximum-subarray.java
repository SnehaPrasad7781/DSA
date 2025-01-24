class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans=ans<sum? sum :ans;
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
