class Solution {
    public int removeDuplicates(int[] nums) {
        int curr=nums[0],k=1;
        for(int i=1;i<nums.length;i++){
            while(i<nums.length && nums[i] == nums[i-1]){
                i++;
            }
            if(i == nums.length){
                break;
            }
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}
