class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int low = 0, high = m-1;
            int num = nums1[i];
            while(low<=high){
                int mid = low + (high-low)/2;
                if(nums2[mid] == num){
                    if(list.contains(num)){
                        break;
                    } else {
                        list.add(num);
                    }
                } else if( nums2[mid] < num){
                    low = mid +1;
                } else {
                    high = mid -1;
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}