class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] sol = new boolean[nums.length-1];
        int x = -1;
        for(int i=0;i<nums.length;i++){
            if(sol[nums[i]-1]){
                x = nums[i];
                break;
            }
            sol[nums[i]-1] = true;
        }
        return x;
    }
}
