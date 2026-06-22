//Spiral Matrix LC-54
//TC - O(m*n)
//SC - O(m*n)

class SpiralMatrix{
    public List<Integer> SpiralOrder(int[][] matrix){
        int left = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[o].length - 1;
        
        while(top <= bottom && left <= right){
             
             for(int i = left; i <= right; i++){
                 ans.add(matrix[top][i]);
             }
             top++;
             
             for(int i = top; i <= bottom; i++){
                  ans.add(matrix[i][right]);
             }
             if(top <= bottom){
                 for(int i = right; i >= left; i--){
                      ans.add(matrix[bottom][i]);
                 }
                 bottom--;
             }
             if(left <= right){
                 for(int i = bottom; i >= top; i--){
                      ans.add(matrix[i][left]);
                 }
                 left++;
             }
             return ans;
        }
    }
}