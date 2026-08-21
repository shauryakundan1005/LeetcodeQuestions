class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int letter = letters[mid];
            if(letter > target){
                high = mid -1;
            } else {
                low = mid+1;
            }
        }
        if(low<letters.length){
            return letters[low];
        }
        return letters[0];
    }
}