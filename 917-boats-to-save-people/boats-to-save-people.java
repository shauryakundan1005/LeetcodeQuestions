class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int i = 0, j = n-1;
        int count = 0;
        while(i<n && i<=j){
            if((people[i] + people[j])<= limit){
                count++;
                i++;
                j--;
            }
             else if(people[j]<=limit){
                count++;
                j--;
            } 
            else {
                i++;
            }
        }
        return count;
    }
}