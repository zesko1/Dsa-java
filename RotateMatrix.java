//Rotate matrix by 90 LC-48
//TC - O(n^2)
//SC - O(1)
//Approach - Transpose then reverse the elements of each row 

class RotateMatrix {
    public void rotate(int[][] matrix){
        matrix.length = n;
        
        //Transpose 
        for(int i = 0; i < n-1; i++)//as check the index of lower & upper triangle of the diagonal
        {
         for(int j = i + 1; j < n; j++){
             int swap = matrix[i][j];
             matrix[i][j] = matrix[j][i];
             matrix[j][i] = swap;
         }   
        }
        //reverse the elements of row
        for(int i = 0; i < n; i++){
            int left = 0; 
            int right = n-1;
            
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}