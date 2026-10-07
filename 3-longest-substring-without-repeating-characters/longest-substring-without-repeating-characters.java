class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int maxLength=0;
        int start=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(hs.contains(ch)){
                while(s.charAt(start)!=ch){
                    hs.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
            else{
                hs.add(ch);
            }
            maxLength=Math.max(maxLength,i-start+1);
        }
        maxLength=Math.max(maxLength,n-start);
        return maxLength;
    }
}

