 //Pascal's Triangle LC-118
 //TC - O(N^2)
 //SC - O(N^2)
 
 class PascalTriangle{
     public int List<List<Integer>> generate(int numRows){
         
         List<List<Integer>> ans = new ArrayList<>();
         
         for(int i = 0; i < numRows; i++){
             
             List<Integer> row = new ArrayList<>();
             
             row.add(1); // as the 1st elem is always 1
             
             for(int j = 1; j < i; j++){
                 
                 int value = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                 
                 row.add(value);
             }
             if(i > 0){ // last elem is also always 1
                 row.add(1); 
             }
             ans.add(row);
         }
         retrurn ans;
     }
 }