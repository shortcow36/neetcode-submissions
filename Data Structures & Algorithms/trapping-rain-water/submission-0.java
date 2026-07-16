class Solution {
    public int trap(int[] height) {
        int[] preMax = new int[height.length];
        int[] postMax = new int[height.length];
        int max = 0;
        int sol = 0;
        for(int i = 1; i < height.length; i++){
            max = Math.max(height[i-1], max);
            preMax[i] = Math.max(preMax[i-1], max);
            //System.out.println(i + ": " + preMax[i]);
        }
        max = 0;
        for(int i = height.length-2; i > 0; i--){
            max = Math.max(height[i+1], max);
            postMax[i] = Math.max(postMax[i+1], max);
            //System.out.println(i + ": " + preMax[i]);
        }
        for(int i = 0; i < height.length; i++){
            int curr = Math.min(preMax[i], postMax[i]) - height[i];
            //System.out.println(curr);
            if(curr > 0){
                
                sol += curr;
            }
        }
        return sol;
    }
}
