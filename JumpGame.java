class Solution {
    public boolean canJump(int[] nums) {
        int c = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i] >= c){
                c = i;
            }
        }
        return c==0;
    }
}
