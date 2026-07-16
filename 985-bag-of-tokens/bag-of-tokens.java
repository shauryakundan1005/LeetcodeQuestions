class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int score =0, maxScore=0;
        int i = 0, j = n-1;
        if(n==1){
            return (power>=tokens[0])?1:0;
        }
        while(i<=j){
            if(power >= tokens[i]){
                power -= tokens[i];
                score++;
                i++;
            } else if(score >= 1){
                power += tokens[j];
                score--;
                j--;
            } else {
                break;
            }
           maxScore = Math.max(maxScore, score);
        } 
        return maxScore;
    }
}