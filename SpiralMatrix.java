class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int t = 0,r = matrix[0].length-1,b = matrix.length-1,l = 0;
        List<Integer> sol = new ArrayList<>();
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                sol.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                sol.add(matrix[i][r]);
            }
            r--;
            if(t<=b){
            for(int i = r;i>=l;i--){
                sol.add(matrix[b][i]);
            }
            b--;
            }
            if(l<=r){
            for(int i = b;i>=t;i--){
                sol.add(matrix[i][l]);
            }
            l++;
            }
        }
        return sol;
    }
}
