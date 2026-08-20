class q42 {
    public static int trap(int[] height) {
        int left = 0;
        int right = 0;
        int area = 0;
        int blocks = 0;
        int actual_max = 0;
        int max_element_index = 0;
        int len = height.length;
        int max = 0;

        for(int i = 0;i<len;i+=1){
            int hi = height[i];
            if(max<hi){
                max = hi;
                max_element_index = i;
            }
        }

        for(int i = left;i<max_element_index+1;i+=1){
            int hl = height[left];
            int rl = height[right];
            if(hl <= rl && left != right){
                area = (right-left-1)*hl;
                actual_max += area-blocks;
                blocks = 0;
                area = 0;
                left=right;
                right+=1;
            }
            else{

                if(left!=right){
                    blocks += rl;
                }
                right+=1;
            }
        }

        left = right = len-1;
        for(int i = len-1;i>max_element_index-1;i-=1){
            int hl = height[left];
            int rl = height[right];
            if(rl <= hl && left != right){
                area = (right-left-1)*rl;
                actual_max += area-blocks;
                blocks = 0;
                area = 0;
                right=left;
                left-=1;
            }
            else{

                if(left!=right){
                    blocks += hl;
                }
                left-=1;
            }
        }
        return actual_max;

    }

    public static void main(String[] args){
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.err.println(trap(nums));
    }
}