class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c: t.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        int have = 0;
        int need = freq.size();
        int solLen = Integer.MAX_VALUE;
        int l = 0;
        int[] sol = new int[2];
        HashMap<Character, Integer> window = new HashMap<>();
        for(int r = 0; r < s.length(); r++){
            window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0)+1);
            if(freq.containsKey(s.charAt(r)) && freq.get(s.charAt(r)) == window.get(s.charAt(r))){
                have++;
            }
            while(have == need /*&& r < s.length() && l < s.length()*/){
                if(solLen > (r-l+1)){
                    solLen = r-l+1;
                    sol[0] = l;
                    sol[1] = r;
                }
                window.put(s.charAt(l), window.getOrDefault(s.charAt(l), 0)-1);
                if(freq.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < freq.get(s.charAt(l))){
                    have--;
                }
                l++;
            }
        }
        if(solLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(sol[0], sol[1]+1);

    }
}
