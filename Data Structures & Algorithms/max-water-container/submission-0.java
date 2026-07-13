class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int sol = 0;
        while(left < right){
            int cur = (right-left) * Math.min(heights[left], heights[right]);
            sol = Math.max(cur,sol);
            if(heights[left] <= heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return sol;
    }
}
