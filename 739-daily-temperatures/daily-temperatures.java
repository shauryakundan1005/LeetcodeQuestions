class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        for(int i =2*n - 1; i>=0; i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i%n]){
                stack.pop();
            }

            if(i<n){
                if(stack.isEmpty()){
                    res[i] = 0;
                } else {
                    res[i] = stack.peek()-i>0? stack.peek()-i: 0;
                }
            }
            stack.push(i%n);
        }
        return res;
    }
}