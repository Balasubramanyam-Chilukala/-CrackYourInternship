class Solution {
    public int maxArea(int[] height) {
        int l = 0,r = height.length-1;
        int max = 0;
        while(l<r){
            int curr = Math.min(height[l],height[r]);
            max = Math.max(curr*(r-l),max);
                while(l<r && height[l] <= curr){
                    l++;
                }
                while(l<r && height[r] <= curr){
                r--;
                }
            }
        return max;
    }
}
