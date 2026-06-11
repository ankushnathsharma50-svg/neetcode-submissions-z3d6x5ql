class Solution {
    public boolean hasDuplicate(int[] arr) {
       HashSet<Integer> set = new HashSet<>();
       for(int ele : arr){
        if(set.contains(ele)){
            return true;

        }
         set.add(ele);
       }
        return false;
    }
}