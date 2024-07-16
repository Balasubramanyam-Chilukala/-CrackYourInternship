class Solution {
    public void moveZeroes(int[] nums) {
        int x = 0;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                arr[x] = nums[i];
                x++;
            }
        }
        for(int i=0;i<x;i++){
            nums[i] = arr[i];
        }
        for(int i=x;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
