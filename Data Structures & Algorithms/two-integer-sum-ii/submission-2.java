class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] sol = new int[2];
        HashMap<Integer, Integer> numMap =  new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            numMap.put(numbers[i], i+1);
        }
        for(int key: numMap.keySet()){
            if(numMap.containsKey(target-key) && numMap.get(key) !=
            numMap.get(target-key)){
               sol[0] = numMap.get(key);
               sol[1] = numMap.get(target-key);
               Arrays.sort(sol);
               return sol;
            }
        }
        return sol;
    }
}
