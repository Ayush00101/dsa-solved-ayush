import java.util.*;

//Second Solution

// class Solution {

//     public boolean isAnagram(String s, String t){

//         int[] arr = new int[126];
//         if(s.length() != t.length()){
//             return false;
//         }

//         for(int i = 0;i<s.length();i+=1){
//             arr[(int) s.charAt(i)] += 1;
//             arr[(int) t.charAt(i)] -= 1;
//         }

//         for(int i:arr){
//             if(i != 0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public static void quickSort(char[] array,int start,int end){
        if(start >= end){
            return;
        }

        int pivot = partition(array,start,end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1,end);

    }

    public static int partition(char[] array,int start,int end){
        int pivot = array[end];
        int i = start-1;
        
        for(int j = start;j<end;j+=1){
            if(array[j]<pivot){
                i+=1;
                char temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i+=1;
        char temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
    // public boolean isAnagram(String s, String t) {
        
    // }

    public static void main(String[] args){
        String s = "anagram";
        String t = "naagram";
        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();

        quickSort(st,0,s.length()-1);
        quickSort(tt,0,s.length()-1);

        if(Arrays.equals(st, tt)){
            System.err.println("True");
        }
        System.err.println(Arrays.toString(st));
        System.err.println(Arrays.toString(tt));

    }
}