class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = nums[0];

        for(int k : nums){
            if(j != k){
                nums[i] = k;
                i+=1;
                j = k;
            }
        }
        return i;
    }
}