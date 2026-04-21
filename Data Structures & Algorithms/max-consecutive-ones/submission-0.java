class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int curr = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
              if(arr[i] == 1){
                curr++;
              }
              else{
                curr = 0;
              }
        if(curr > max){
            max = curr;
        }
    }
        
        return max;
    }
}