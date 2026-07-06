class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = 1;
        int[] sol = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sol[i] = prefix;
            prefix *= nums[i];
        }
        for(int i = nums.length-1; i >= 0; i--){
            sol[i] *= postfix;
            postfix *= nums[i];
        }
        return sol;
    }
}  
