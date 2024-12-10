class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            n = squareDigits(n);
        }
        if(n == 1 || n == 7){
            return true;
        } else {
            return false;
        }
    }

    public int squareDigits(int n){
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + (rem*rem);
            n = n / 10;
        }
        return sum;
    }
}