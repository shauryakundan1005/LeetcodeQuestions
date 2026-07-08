class Pair{
    char ch;
    int freq;
    Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(!stack.isEmpty() && stack.peek().ch == ch){
                if(stack.peek().freq == k-1){
                    stack.pop();
                    continue;
                }
                stack.peek().freq++;
            } else {
                stack.push(new Pair(ch, 1));
            }
        }
        while(!stack.isEmpty()){
            Pair top = stack.pop();
            int freq = top.freq;
            while(freq-- > 0){
                res.append(top.ch);
            }
        }
        return res.reverse().toString();
    }
}