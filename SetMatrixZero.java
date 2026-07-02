//Set Matrix Zero LC-73
//TC - O(2*n*m)
//SC - O(1)

class SetMatrixZero{
    public void setMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        
        //col[m] = {0} -> matrix[..][0]
        //row[n] = {0} -> matrix[0][..]
        
        int col0 = 1;
        
        //mark 1st row & 1st col
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                //mark i-th row
                matrix[i][0] = 0;
                }
                //mark j-th col
                if(j != 0){
                    matrix[0][j] = 0;
                }
                else{
                    col0 = 0;
                }
             }
        }
        //mark the raming matrix 
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        //mark the col first as its depend on row
        if(matrix[0][0] == 0){
            for(int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }
        
        //mark the last row 
        if(col0 == 0){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }
    }
}

