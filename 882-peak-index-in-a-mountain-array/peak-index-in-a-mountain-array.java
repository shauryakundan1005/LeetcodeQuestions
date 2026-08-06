class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0, high = n -1, res=-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid<(n-1) && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                res = mid;
                break;
            } else if(mid<(n-1) && arr[mid] > arr[mid+1]) {
                high= mid-1;
            }
            else {
               low = mid+1;
            }
        }
        return res;
    }
}