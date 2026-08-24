class Solution {
    private int findDays(int[] weights, int capacity){
        int n = weights.length;
        int sum = weights[0], days = 1;
       for(int i = 1; i<n; i++){
            if(sum + weights[i] <= capacity){
                sum += weights[i];
            } else {
                days++;
                sum = weights[i];
            }
       }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low= Integer.MIN_VALUE, high=0, res=-1;
        for(int i = 0; i<n; i++){
            low = Math.max(low, weights[i]);
            high += weights[i];
        } 
        while(low<=high){
            int mid = low + (high-low)/2;
            int daysTaken = findDays(weights, mid);
            if(daysTaken <= days){
                res = mid;
                high = mid-1;
            } else {
                low = mid +1;
            }
        }
        return res;
    }
}