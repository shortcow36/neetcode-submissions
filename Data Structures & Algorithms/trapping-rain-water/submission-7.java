class Solution {
    public int trap(int[] height) {
        // if(height == null || height.length == 0){
        //     return 0;
        // }
        int left = 0, right = height.length -1;
        int preMax = height[left];
        int postMax = height[right];
        int sol = 0;

        while(left < right){
            if(preMax < postMax){
                left++;
                preMax = Math.max(height[left], preMax);
                sol += preMax - height[left];
            }
            else{
                right--;
                postMax = Math.max(height[right], postMax);
                sol += postMax - height[right];
            }
        }

        return sol;
    }
}
