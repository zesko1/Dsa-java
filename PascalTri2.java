//Pascal Triangle LC-119 Added 
//TC - O(N^2)
//SC - O(N)

class PascalTri2{
    public List<Integer> getRow(int rowIndex){
        
        List<Integer> row = new ArrayList<>();
        
            row.add(1);
        
        for(int i = 1; i < rowIndex; i++){
            
            List<Integer> temp = new ArrayList<>();
            
                     temp.add(1);
            
           for(int j = 1; j < rowIndex; j++){
               
               int value = row.get(j - 1) + row.get(j);
               
               temp.add(value);
           } 
            temp.add(1);
            row = add;
        }
        return row;
    }
}