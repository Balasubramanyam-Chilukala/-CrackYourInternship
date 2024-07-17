class Solution {
    public int majorityElement(int[] nums) {
        int el = nums[0],c = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == el){
                c++;
            }else{
                if(c>0){
                    c--;
                }else{
                    el = nums[i];
                    c = 1;
                }
            }
        }
        return el;
    }
}
