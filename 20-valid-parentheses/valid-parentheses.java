class Solution {
    public boolean isValid(String s) {
        Stack stack=new Stack();
        int n=s.length();
        if(n==1)    return false;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') stack.push(')');
            else if(ch=='[')    stack.push(']');
            else if(ch=='{')    stack.push('}');
            else{
                if(stack.isEmpty()) return false;
                else if(!stack.peek().equals(ch))    return false;
                else    stack.pop();
            }
        }
        return stack.isEmpty()?true:false;
    }
}