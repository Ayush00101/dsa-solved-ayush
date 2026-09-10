class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int l = nums.length/2;
        int[] ans = new int[2*n];
        int count = 0;
        for(int i = 0 ; i<n;i+=1){
            ans[count] = nums[i];
            ans[count+1] = nums[n+i];
            count += 2;
            if(count>=2*n){
                break;
            }
        }
        return ans;
    }
}