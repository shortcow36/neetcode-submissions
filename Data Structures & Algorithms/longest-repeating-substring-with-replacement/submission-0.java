class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int left = 0, max = 0, sol = 0;
        for(int i = 0; i < s.length(); i++){
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            max = Math.max(max, count.get(s.charAt(i)));

            while((i-left+1) - max > k){
                count.put(s.charAt(left), count.get(s.charAt(left))-1);
                left++;
            }
            sol = Math.max(sol, i-left+1);
        }

        return sol;
    }
}
