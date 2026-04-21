class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int maj = arr[0];
        
        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == maj){
                count++;
            }
            
            else if(count == 0){
                maj = arr[i];
                count = 1;
            }
            else{
                count--;
            }
        }
        return maj;
    }
}