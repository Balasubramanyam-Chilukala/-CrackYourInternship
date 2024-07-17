class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j = i+1 , k = nums.length-1;
            if(i!=0 && nums[i] == nums[i-1]){
                continue;
            }
            while(j<k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[k]);
                    sol.add(res);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }else if(nums[i]+nums[j]+nums[k] >0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return sol;
    }
}
