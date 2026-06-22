class Solution {
    public boolean isValid(String s) {
        int n= s.length();
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<n ; i++){
            char ch = s.charAt(i);
            boolean check = stack.isEmpty();
            if(!check && ch == '}'){
                if(stack.peek()=='{'){
                    stack.pop();
                    continue;
                } else { return false;}
            } else if(!check && ch == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                    continue;
                } else {return false;}
            } else if(!check && ch==']'){
                if(stack.peek() == '['){
                    stack.pop();
                    continue;
                } else { return false;}
            } else {
                stack.push(ch);
            }
        }
        if(stack.isEmpty()){
            return true;
        } else { return false;}
    }
}