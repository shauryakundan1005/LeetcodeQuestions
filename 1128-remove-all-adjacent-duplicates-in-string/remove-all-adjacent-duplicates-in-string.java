class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i =1; i<s.length(); i++){
            char ch = s.charAt(i);
            if(stack.size()>=1 && ch == stack.peek()){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        String ans="";
        for(char ch : stack){
            ans += ch;
        }
        return ans;
    }
}