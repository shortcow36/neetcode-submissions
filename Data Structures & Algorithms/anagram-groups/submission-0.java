class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();
        for(String s : strs){
            int [] alpha = new int[26];
            for(char let : s.toCharArray()){
                alpha[let - 'a']++;
            }
            String key = Arrays.toString(alpha);
            freq.putIfAbsent(key, new ArrayList<>());
            freq.get(key).add(s);
        }
        return new ArrayList<>(freq.values());

    }
}
