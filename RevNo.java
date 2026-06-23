//Reverse the Number LC-7
//TC - O(log10(x))
//SC - O(1)

class RevNo{
    public int reverse(int x){
        int revNum = 0;
        
        while(x != 0){
            int lastDig = x % 10;
            x = x/10;
            //check for positive overflow
            if(revNum > Integer.MAX_VALUE/10 || revNum == Integer.MAX_VALUE/10 && lastDig < 7){
                return 0;
            }
            //check for negative overflow
            if(revNum < Integer.MIN_VALUE/10 || revNum == Integer.MIN_VALUE/10 && lastDig >-8){
                return 0;
            }
            revNum = (revNum * 10) + lastDig;
        }
        return revNum;
    }
}