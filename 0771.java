import java.util.*;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();

        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }

        int count = 0;

        for(char st : stones.toCharArray()){
            if(set.contains(st)){
                count++;
            }
        }
        return count;
    }
}