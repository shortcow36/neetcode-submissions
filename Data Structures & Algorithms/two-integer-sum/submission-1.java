class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> look = new HashMap<>();
        int difference = 0;
        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];
            if(look.containsKey(difference)){
                return new int[]{look.get(difference), i};
            }
            look.put(nums[i], i);
        }
        return new int[0];
    }
}
