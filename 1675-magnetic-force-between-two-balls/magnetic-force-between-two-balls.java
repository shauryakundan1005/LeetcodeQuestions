class Solution {
    private int findBalls(int[] position, int gap){
        int n = position.length;
        int prev=position[0], balls=1;
        for(int i = 1; i<n; i++){
            if(position[i]-prev>=gap){
                balls++;
                prev=position[i];
            }
        }
        return balls;
    }

    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int low=1, high = position[n-1] - position[0], res=-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            int balls = findBalls(position, mid);
            if(balls>=m){
                res = mid;
                low = mid+1;
            } else {
                high = mid -1;
            }
        }
        return res;
    }
}