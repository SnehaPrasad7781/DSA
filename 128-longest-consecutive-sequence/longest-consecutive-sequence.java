class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=1,n=nums.length;
        Set<Integer> set= new HashSet<>();
        if(n==0) return 0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt=1;
                int x=it;
            
            while(set.contains(x+1)){
                x=x+1;
                cnt++;
            }
            longest=Math.max(cnt,longest);
        }
        }
        return longest;
    }
}


