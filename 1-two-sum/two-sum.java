class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int l=target-nums[i];
            if(map.containsKey(l)){
                ans[0]=map.get(l);
                ans[1]=i;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}