class Solution {
    public void setZeroes(int[][] matrix) {
       int r[] = new int[matrix.length];
       int c[] = new int[matrix[0].length];
       for(int i=0;i<matrix.length;i++){
           r[i] = 0;
       }
       for(int i=0;i<matrix[0].length;i++){
           c[i] = 0;
       }
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j] == 0){
                   r[i]++;
                   c[j]++;
               }
           }
       }
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               if(r[i] != 0){
                   matrix[i][j] = 0;
               }
               if(c[j] != 0){
                   matrix[i][j] = 0;
               }
           }
       }
    }
}
