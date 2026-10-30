class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int low = 0, high = n-1;
            int num = 2 * arr[i];
            while(low <= high){
                int mid = low + (high-low)/2;
                if(arr[mid] == num && mid != i){
                    return true;
                } else if(arr[mid]  < num){
                    low = mid +1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;

    }
}