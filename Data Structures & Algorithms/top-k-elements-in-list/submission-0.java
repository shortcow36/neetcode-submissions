class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        for(int n: nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] sol = new int[k];
        for(int i = 0; i < k; i++){
            sol[i] = heap.poll()[1];
        }
        
        return sol;
    }
}
