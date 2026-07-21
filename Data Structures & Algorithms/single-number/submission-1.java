class Solution {
    public int singleNumber(int[] nums) {
        int sol = 0;
        for(int num: nums){
            sol ^= num;
        }
        return sol;
    }
}
