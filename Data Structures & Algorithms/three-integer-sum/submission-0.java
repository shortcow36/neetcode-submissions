class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if(cur > 0)
                break;
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int tS = cur + nums[left] + nums[right];
                if(tS > 0){
                    right--;
                }
                else if(tS < 0){
                    left++;
                }
                else{
                    sol.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                }
        
            }
        }
        return sol;
    }
}
