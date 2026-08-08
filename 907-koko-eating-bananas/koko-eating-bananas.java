class Solution {
    private long findHour(int[] piles, int speed){
        long h = 0;
        for(int i = 0; i<piles.length; i++){
            h += piles[i]/speed;
            if(piles[i] % speed != 0){
                h++;
            }
        }
        return h;
    }


    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, res = -1;
        int high = piles[0];
        for(int i = 1 ;i<piles.length; i++){
            high = Math.max(high, piles[i]);
        }

        while(low<=high){
            int mid = low + (high-low)/2;
            long hour = findHour(piles, mid);
            if(hour<=h){
                high = mid -1;
                res = mid;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}