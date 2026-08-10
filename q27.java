class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0;i<nums.length;i+=1){
            if(nums[i]!=val){
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count+=1;
            }
        }
        return count;
    }
}
