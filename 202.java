import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = squareDigits(n);
        }
        return n == 1;
    }

    private int squareDigits(int n){
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + (rem*rem);
            n = n / 10;
        }
        return sum;
    }
}