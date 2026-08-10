class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int[] array = new int[128];
        int len = s.length();
        int maxLen = 0;

        while (right < len) {
            int rv = s.charAt(right);
            
            if (array[rv] == 0) {
                array[rv] = 1;
                right += 1;   
                maxLen = Math.max(maxLen, right - left);
            } 
            else {

                int lv = s.charAt(left);
                array[lv] = 0; 
                left += 1;
            }
        }
        return maxLen;
    }
}