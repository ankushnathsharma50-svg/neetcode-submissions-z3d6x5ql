class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer , Integer> map = new HashMap<>();
        int n = arr.length;

        // for(int i = 0; i<n; i++){
        //     for(int j = i+1; j<n; j++){
        //        if(arr[i] + arr[j] == target){
        //         return new int[] {i,j};
        //        }
        //     }
        // }
        // return new int[]{};

       for(int i = 0; i < n;i++){
        int lookingFor = target - arr[i];

        if(map.containsKey(lookingFor)){
            return new int[]{map.get(lookingFor),i};
           
        }
         map.put(arr[i],i);
       }
       return new int[]{-1,-1};

    }
}
