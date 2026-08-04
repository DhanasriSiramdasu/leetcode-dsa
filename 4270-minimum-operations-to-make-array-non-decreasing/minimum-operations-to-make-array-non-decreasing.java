class Solution {
    public long minOperations(int[] nums) {
        int n=nums.length;
        long res=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                res+=(nums[i-1]-nums[i]);
            }
        }
        return res;
    }
}