class Solution {
    public int hIndex(int[] citations) {
        int low = 0, high = citations.length -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int papers = citations.length - mid;
            if(citations[mid] >= papers){
                high= mid -1;
            } else {
                low = mid +1;
            }
        }
        return citations.length-low;
    }
}