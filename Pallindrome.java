public class Pallindrome {
    public boolean isPallindrome(int x) {
        int dup = x;
        int revNum = 0;

        if (x < 0) {
            return false;
        }
        while (x != 0) {
            int lastDigit = x % 10;
            x = x / 10;
             revNum = revNum * 10 + lastDigit;
        }

        return dup == revNum;
    }
}
