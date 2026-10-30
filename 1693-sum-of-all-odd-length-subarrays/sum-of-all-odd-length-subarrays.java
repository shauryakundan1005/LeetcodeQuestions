class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        int sum = arr[0];
        prefix[0] = arr[0];
        for(int i =1; i<n; i++){
            sum+= arr[i];
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int left = 0; left<n; left++){
            int right = left + 1;
            while(right<n){
                if((right - left + 1)%2 ==1){
                    if(left != 0 ){
                    sum += prefix[right] - prefix[left -1];
                    } else {
                        sum += prefix[right];
                    }
                }
                right++;
            }
        }
        return sum;
    }
}