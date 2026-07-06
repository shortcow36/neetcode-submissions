class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> look = new HashMap<>();
        int difference = 0;
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];
            if(look.containsKey(difference)){
                ans[0] = look.get(difference);
                ans[1] = i;
                return ans;
            }
            look.put(nums[i], i);
        }
        return ans;
    }
}
