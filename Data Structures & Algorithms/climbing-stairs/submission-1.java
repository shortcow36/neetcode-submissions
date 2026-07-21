class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int prevOne = 1;
        int prevTwo = 2;
        for(int i = 3; i < n+1; i++){
            int curr = prevOne+prevTwo;
            prevOne = prevTwo;
            prevTwo = curr;
        }

        return prevTwo;
    }
}
