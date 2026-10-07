class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long ans=0;
        long low=1;
        long high=Arrays.stream(piles).max().getAsInt();
        while(low<=high){
            long mid=low+(high-low)/2;
            if(had_done(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
    private boolean had_done(long mid,int[] piles,int h){
        long count=0;
        for(int i=0;i<piles.length;i++){
            count+=(piles[i]+mid-1)/mid;
        }
        if(count<=h)    return true;
        return false;
    }
}