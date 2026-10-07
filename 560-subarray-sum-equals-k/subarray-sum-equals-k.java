class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        if(k==0 && n==1)    return 0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int curr_sum=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<n;i++){
            curr_sum+=nums[i];
            if(hm.containsKey(curr_sum-k)){
                count+=hm.get(curr_sum-k);
            }
            hm.put(curr_sum,hm.getOrDefault(curr_sum,0)+1);
        }
        return count;
    }
}