class Solution {
    public int majorityElement(int[] nums) {
        int element = 0;
        int frequency = 0;
        for (int value : nums) {
            if (frequency == 0) {
                element = value;
            }
            if (value == element) {
                frequency++;
            } else {
                frequency--;
            }
        }
        return element;
    }
}