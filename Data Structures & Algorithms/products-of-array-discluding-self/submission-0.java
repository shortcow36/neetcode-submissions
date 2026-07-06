class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int numZ = 0;
        int[] sol = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                numZ++;
            }
            else{
                prod = prod*nums[i];
            }
        }
        if(numZ > 1){
            return sol;
        }
        else if(numZ == 0){
            for(int i = 0; i < sol.length; i++){
                sol[i] = prod/nums[i];
            }
        }
        else if(numZ == 1){
            for(int i = 0; i < sol.length; i++){
                if(nums[i] == 0){
                    sol[i] = prod;
                }
            }
        }
        return sol;
    }
}  
