class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = s.length();
        int i = 0, sol = 0;
        HashSet<Character> dup = new HashSet<>();
        while(left < right && i < right){
            if(dup.contains(s.charAt(i))){
                left++;
                i = left;
                dup = new HashSet<>();
                dup.add(s.charAt(i));
                i++;
            }
            else{
                dup.add(s.charAt(i));
                i++;
                sol = Math.max(sol, i-left);
            }
        }
        return sol;
    }
}
