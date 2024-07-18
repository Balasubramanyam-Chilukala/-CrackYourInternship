class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ls = 0,rs = 0;
        int l=k-1,r = cardPoints.length-1;
        for(int i=0;i<k;i++){
            ls+=cardPoints[i];
        }
        int maxs = ls;
        while(l>=0){
            ls = ls-cardPoints[l];
            rs = rs+cardPoints[r];
            maxs = Math.max(ls+rs,maxs);
            l--;
            r--;
        }
        return maxs;
    }
}
