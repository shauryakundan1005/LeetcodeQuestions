class Solution {
    private int findSuccess(int spell, int[] potions, long success){
        int m = potions.length;
        int low = 0, high = m-1,res = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if((long)spell*potions[mid] >= success){
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(res == -1){
            return 0;
        }
        return m-res;
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for(int i=0; i<n; i++){
            pairs[i] = findSuccess(spells[i], potions, success);
        }
        return pairs;
    }
}