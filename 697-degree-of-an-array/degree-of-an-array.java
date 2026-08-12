class Solution {
    public int findShortestSubArray(int[] nums) {
        int n=nums.length;
        int ans=n;
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        pq.addAll(hm.entrySet());
        int freq=pq.peek().getValue();
        int left=0;
        int right=n-1;
        while(!pq.isEmpty() && pq.peek().getValue()==freq){
            int maxval=pq.peek().getKey();
            ans=Math.min(ans,findlength(nums,left,right,maxval));
            pq.poll();
        }
        return ans;
    }
    private int findlength(int[] nums,int left,int right,int max){
        while(nums[left]!=max){
            left++;
        }
        while(nums[right]!=max){
            right--;
        }
        return right-left+1;
    }
}