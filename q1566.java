class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        
        int len = arr.length;
        int count = 0;

        for(int j = 0;j<len-m;j+=1){
            if(arr[j] == arr[j+m]){
                count+=1;
            }
            else{
                count = 0;
            }
            if(count == m*(k-1)){
                return true;
            }
        }
        return false;
    }
}