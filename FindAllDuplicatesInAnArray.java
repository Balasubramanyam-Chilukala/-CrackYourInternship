class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean freq[] = new boolean[nums.length];
        List<Integer> sol = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]-1]){
                sol.add(nums[i]);
            }
            freq[nums[i]-1] = true;
        }
        return sol;
    }
}
