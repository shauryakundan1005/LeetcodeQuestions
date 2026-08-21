class Solution {
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       int n = arr.length;
       int low =0, high= n-1;
       while(low<high){
        int mid = low + (high-low)/2;
        if(arr[mid]<x){
            low = mid+1;
        } else {
            high = mid;
        }
       }

       int left = low-1;
       int right = low;
       while(k>0){
        if(left<0){
            right++;        
       } else if(right>=n){
            left--;
       } else if(Math.abs(arr[left]-x) <= Math.abs(arr[right] - x)){
            left--;
       } else {
            right++;
       }
       k--;
    }
    List<Integer> res = new ArrayList<>();

        for (int i = left + 1; i < right; i++) {
            res.add(arr[i]);
        }

        return res;
    }
}