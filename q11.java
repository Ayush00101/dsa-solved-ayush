class Solution {
    public int maxArea(int[] height){

        int left = 0;
        int right = height.length-1;
        int max_water = 0;
        int smaller = 0;

        while(left!=right){
            if(height[left]<height[right]){
                smaller = height[left];
                left+=1;
            }
            else{
                smaller = height[right];
                right-=1;
            }
            max_water = Math.max(smaller*(right-left+1),max_water);
        }

        return max_water;
    }
}