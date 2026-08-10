class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] an = new int[2*n];

        for(int i = 0;i<2*n;i+=1){
            an[i] = nums[i%n];
        }
        return an;
    }
}