class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> freqS = new HashMap<>();
        Map<Character, Integer> freqT = new HashMap<>();
        for (char let : s.toCharArray()) {
            freqS.put(let, freqS.getOrDefault(let, 0) + 1);
        }
        for (char let : t.toCharArray()) {
            freqT.put(let, freqT.getOrDefault(let, 0) + 1);
        }
        for (char let : freqS.keySet()){
            if(!freqS.get(let).equals(freqT.get(let))){
                return false;
            }
        }
        return true;
    }
}