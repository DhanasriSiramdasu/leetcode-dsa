class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] res=new int[n];
        Stack<Integer> stack=new Stack();
        stack.push(n-1);
        res[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int temp=temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temp){
                stack.pop();
            }
            if(stack.isEmpty()) res[i]=0;
            else    res[i]=stack.peek()-i;
            stack.push(i);
        }
        return res;
    }
}