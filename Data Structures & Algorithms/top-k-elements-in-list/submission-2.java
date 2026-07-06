class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n: nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer> freq[] = new ArrayList[nums.length+1];
        for(int i = 1; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int key: count.keySet()){
            freq[count.get(key)].add(key);
        }

        int sol[] = new int[k];
        int idx = 0;

        for(int i = freq.length-1; i >= 0 && idx < k; i--){
            for(int j : freq[i]){
                sol[idx++] = j;
                if(idx == k) return sol;
            }
        }
        return sol;
    }
}
